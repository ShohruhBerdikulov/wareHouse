package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Users;
import ecma.aif.warehouse.entitiy.WareHouse;
import ecma.aif.warehouse.projection.UserCustom;
import ecma.aif.warehouse.projection.WarehouseCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "User", collectionResourceRel = "list", excerptProjection = UserCustom.class)
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
