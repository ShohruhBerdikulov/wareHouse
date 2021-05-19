package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Measurement;
import ecma.aif.warehouse.projection.CurrencyCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

@RestController
@RepositoryRestResource(path = "currensy", collectionResourceRel = "list",excerptProjection = CurrencyCustom.class)
public interface CurrensyRepository extends JpaRepository<Currency,Integer> {
}
