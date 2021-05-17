package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.OutputProduct;
import ecma.aif.warehouse.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "outputPro", collectionResourceRel = "list")
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
