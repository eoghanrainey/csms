package pluq.eoghan.chargingsms.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Entity
@Table(name = "evses")
@Getter @Setter @NoArgsConstructor
public class EvseModel {
    @Id
    private String uid;
    private String evseId;
    private String status;
    private String lastUpdated;
    private String physicalReference;

    @ElementCollection
    private List<String> capabilities;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "evse_id")
    private List<ConnectorModel> connectors;
}