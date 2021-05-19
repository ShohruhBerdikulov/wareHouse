package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Suplier;
import ecma.aif.warehouse.entitiy.Users;
import ecma.aif.warehouse.projection.SuplierCustom;
import ecma.aif.warehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "Suplier", collectionResourceRel = "list", excerptProjection = SuplierCustom.class)
public interface SuplierRepository extends JpaRepository<Suplier,Integer> {
}
