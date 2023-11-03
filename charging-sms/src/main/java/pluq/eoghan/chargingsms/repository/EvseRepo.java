package pluq.eoghan.chargingsms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluq.eoghan.chargingsms.models.EvseModel;


@Repository
public interface EvseRepo extends JpaRepository<EvseModel, String> {
}
