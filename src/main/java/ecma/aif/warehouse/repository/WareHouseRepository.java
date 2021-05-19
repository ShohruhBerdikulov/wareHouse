package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.WareHouse;
import ecma.aif.warehouse.projection.CurrencyCustom;
import ecma.aif.warehouse.projection.WarehouseCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "WareHouse", collectionResourceRel = "list", excerptProjection = WarehouseCustom.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}
