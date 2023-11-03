package pluq.eoghan.chargingsms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluq.eoghan.chargingsms.models.LocationModel;

@Repository
public interface LocationRepo extends JpaRepository<LocationModel, String> {
}

