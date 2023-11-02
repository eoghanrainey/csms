package pluq.eoghan.chargingsms.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "locations")
@Getter @Setter @NoArgsConstructor
public class LocationModel {
    @Id
    private String id;
    private String type;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String name;
    private String latitude;
    private String longitude;
    private Boolean chargingWhenClosed;
    private String lastUpdated;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private List<EvseModel> evses;
}