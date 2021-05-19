package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Input;
import ecma.aif.warehouse.projection.InputCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "Input", collectionResourceRel = "list",excerptProjection = InputCustom.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
