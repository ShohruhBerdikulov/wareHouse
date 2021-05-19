package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.InputProduct;
import ecma.aif.warehouse.projection.InputProductCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "InputProduct", collectionResourceRel = "list",excerptProjection = InputProductCustom.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
