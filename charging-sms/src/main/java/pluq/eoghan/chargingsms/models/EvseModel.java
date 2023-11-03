package pluq.eoghan.chargingsms.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EvseModel {
    @Id
    private String uid;

    @JsonProperty("evse_id") // This line is added to map the JSON property to this field
    private String evseId;
    private String status;
    private Instant lastUpdated;
    private String[] capabilities;
    private String physicalReference;
    @OneToMany(mappedBy = "evse", cascade = CascadeType.ALL)
    private List<ConnectorModel> connectors;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationModel location;
}