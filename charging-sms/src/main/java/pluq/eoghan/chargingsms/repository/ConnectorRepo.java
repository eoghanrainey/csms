package pluq.eoghan.chargingsms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluq.eoghan.chargingsms.models.ConnectorModel;

import java.util.UUID;


@Repository
public interface ConnectorRepo extends JpaRepository<ConnectorModel, UUID> {
}
