package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Product;
import ecma.aif.warehouse.entitiy.Suplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "product", collectionResourceRel = "list")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
