package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();

    String getName();

    boolean getActive();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();
}
