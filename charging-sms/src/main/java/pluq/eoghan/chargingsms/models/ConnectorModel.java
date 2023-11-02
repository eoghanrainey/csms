package pluq.eoghan.chargingsms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "connectors")
@Getter @Setter @NoArgsConstructor
public class ConnectorModel {
    @Id
    private String id;
    private String standard;
    private String format;
    private String powerType;
    private Integer voltage;
    private Integer amperage;
    private String lastUpdated;
    private String tariffId;
}