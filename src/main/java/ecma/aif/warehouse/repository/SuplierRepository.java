package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Suplier;
import ecma.aif.warehouse.entitiy.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "suplier", collectionResourceRel = "list")
public interface SuplierRepository extends JpaRepository<Suplier,Integer> {
}
