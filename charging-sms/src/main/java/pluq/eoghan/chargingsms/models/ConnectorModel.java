package pluq.eoghan.chargingsms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ConnectorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String id;
    private String standard;
    private String format;
    private String powerType;
    private Integer voltage;
    private Integer amperage;
    private Instant lastUpdated;
    private String tariffId;

    @ManyToOne
    @JoinColumn(name = "evse_uid")
    private EvseModel evse;
}