package pluq.eoghan.chargingsms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluq.eoghan.chargingsms.models.MeterValueModel;

@Repository
public interface MeterValueRepo extends JpaRepository<MeterValueModel, String> {
}
