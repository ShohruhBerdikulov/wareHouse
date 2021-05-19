package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Measurement;
import ecma.aif.warehouse.entitiy.Output;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
