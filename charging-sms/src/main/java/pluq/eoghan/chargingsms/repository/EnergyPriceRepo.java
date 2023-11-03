package pluq.eoghan.chargingsms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluq.eoghan.chargingsms.models.EnergyPriceModel;


@Repository
public interface EnergyPriceRepo extends JpaRepository<EnergyPriceModel, String> {
}
