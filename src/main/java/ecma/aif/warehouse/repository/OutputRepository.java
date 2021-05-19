package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Output;
import ecma.aif.warehouse.entitiy.OutputProduct;
import ecma.aif.warehouse.projection.OutputCustom;
import ecma.aif.warehouse.projection.ProductCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "Output", collectionResourceRel = "list", excerptProjection = OutputCustom.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
