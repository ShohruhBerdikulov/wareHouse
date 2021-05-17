package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

@RestController
@RepositoryRestResource(path = "client", collectionResourceRel = "list")
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
