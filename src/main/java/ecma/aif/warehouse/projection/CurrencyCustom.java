package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Currensy;
import ecma.aif.warehouse.entitiy.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currensy.class)
public interface CurrencyCustom {
    Integer getId();
}
