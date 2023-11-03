package pluq.eoghan.chargingsms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationModel {

    @Id
    private String id;
    private String type;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String name;
    @Embedded
    private CoordinatesModel coordinates;
    private Boolean chargingWhenClosed;
    private Instant lastUpdated;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<EvseModel> evses;
}