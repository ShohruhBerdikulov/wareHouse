package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "InputProduct", collectionResourceRel = "list")
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
