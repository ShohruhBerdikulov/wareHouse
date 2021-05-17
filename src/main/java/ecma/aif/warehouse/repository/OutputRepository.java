package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Output;
import ecma.aif.warehouse.entitiy.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "output", collectionResourceRel = "list")
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
