package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.OutputProduct;
import ecma.aif.warehouse.entitiy.Product;
import ecma.aif.warehouse.projection.OutputCustom;
import ecma.aif.warehouse.projection.OutputProductCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "outputPro", collectionResourceRel = "list",excerptProjection = OutputProductCustom.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
