package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Category;
import ecma.aif.warehouse.entitiy.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();

    String getName();

    boolean getActive();

    Category getCategoty();
}
