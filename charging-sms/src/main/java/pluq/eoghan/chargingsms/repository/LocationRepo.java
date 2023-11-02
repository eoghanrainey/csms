package pluq.eoghan.chargingsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pluq.eoghan.chargingsms.models.LocationModel;
import pluq.eoghan.chargingsms.models.MeterValueModel;

public interface LocationRepo extends JpaRepository<LocationModel, String> {
}

