package pluq.eoghan.chargingsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pluq.eoghan.chargingsms.models.ConnectorModel;


public interface ConnectorRepo extends JpaRepository<ConnectorModel, String> {
}
