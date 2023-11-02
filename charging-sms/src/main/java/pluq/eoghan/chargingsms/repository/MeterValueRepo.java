package pluq.eoghan.chargingsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pluq.eoghan.chargingsms.models.MeterValueModel;

public interface MeterValueRepo extends JpaRepository<MeterValueModel, String> {
}
