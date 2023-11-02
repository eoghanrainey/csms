package pluq.eoghan.chargingsms.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;


@Entity
@Table(name = "metervalues")
@Getter
@Setter
@NoArgsConstructor
public class MeterValueModel {

    @Id
    private String transactionId;
    private ZonedDateTime date;
    private ZonedDateTime dateAdded;
    private String physicalReference;
    private double meterValue;
}