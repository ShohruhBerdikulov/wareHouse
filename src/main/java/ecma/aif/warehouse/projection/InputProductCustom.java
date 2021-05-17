package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductCustom {
    Integer getId();

    Product getProduct();

    Integer getAmount();

    Integer getPrice();

    Date getDate();

    Input getInput();
}
