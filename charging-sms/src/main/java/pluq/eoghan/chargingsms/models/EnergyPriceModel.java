package pluq.eoghan.chargingsms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "energyprices")
@Getter  @Setter @NoArgsConstructor
public class EnergyPriceModel {

    @Id
    private String id;
    private String country;
    private String buyVolume;
    private String sellVolume;
    private String price;
    private String currency;
    private String unit;
    private LocalDate date;
    private String timeslot;
}