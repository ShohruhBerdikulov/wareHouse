package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Users;
import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "user", collectionResourceRel = "list")
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
