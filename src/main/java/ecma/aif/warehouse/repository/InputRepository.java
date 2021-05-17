package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "Input", collectionResourceRel = "list")
public interface InputRepository extends JpaRepository<Input,Integer> {
}
