package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Product;
import ecma.aif.warehouse.entitiy.Suplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();
}
