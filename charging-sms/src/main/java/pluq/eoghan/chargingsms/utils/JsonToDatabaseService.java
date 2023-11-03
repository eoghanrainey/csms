package pluq.eoghan.chargingsms.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pluq.eoghan.chargingsms.models.ConnectorModel;
import pluq.eoghan.chargingsms.models.EvseModel;
import pluq.eoghan.chargingsms.models.LocationModel;
import pluq.eoghan.chargingsms.repository.LocationRepo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class JsonToDatabaseService {
    @Autowired
    private LocationRepo locationRepo;
    @Autowired
    private ObjectMapper mapper;

    @Transactional
    public void parseJsonFileToDatabase(InputStream jsonStream) throws IOException {

        mapper.registerModule(new JavaTimeModule());
        TypeFactory typeFactory = mapper.getTypeFactory();
        CollectionType collectionType = typeFactory.constructCollectionType(List.class, LocationModel.class);

        // Read the JSON from the InputStream into a list of LocationModel
        List<LocationModel> locations = mapper.readValue(jsonStream, collectionType);

        for (LocationModel location : locations) {
            // For each Evse in the Location
            for (EvseModel evse : location.getEvses()) {
                // Set the reference to the location
                evse.setLocation(location);

                // Set the relationship both ways for each Connector
                for (ConnectorModel connector : evse.getConnectors()) {
                    connector.setEvse(evse);
                }
            }
            // Save the Location, which will cascade to save the Evses and Connectors
            locationRepo.save(location);
        }
    }
}