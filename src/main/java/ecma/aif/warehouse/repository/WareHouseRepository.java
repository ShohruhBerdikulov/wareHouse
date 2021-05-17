package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "Warehouse", collectionResourceRel = "list")
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}
