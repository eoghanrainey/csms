package pluq.eoghan.chargingsms.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class CoordinatesModel {
    private String latitude;
    private String longitude;
}