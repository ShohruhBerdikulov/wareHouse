package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Client;
import ecma.aif.warehouse.entitiy.Currensy;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface ClientCustom {
    Integer getId();
}
