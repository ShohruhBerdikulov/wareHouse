package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Measurement;
import ecma.aif.warehouse.entitiy.Output;
import ecma.aif.warehouse.projection.MeasurementCustom;
import ecma.aif.warehouse.projection.OutputCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "measurement", collectionResourceRel = "list",excerptProjection = MeasurementCustom.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
