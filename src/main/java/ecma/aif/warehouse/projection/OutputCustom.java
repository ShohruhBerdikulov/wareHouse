package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Output;
import ecma.aif.warehouse.entitiy.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Output.class)
public interface OutputCustom {
    Integer getId();
}
