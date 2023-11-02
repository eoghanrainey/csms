package pluq.eoghan.chargingsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pluq.eoghan.chargingsms.models.EnergyPriceModel;


public interface EnergyPriceRepo extends JpaRepository<EnergyPriceModel, String> {
}
