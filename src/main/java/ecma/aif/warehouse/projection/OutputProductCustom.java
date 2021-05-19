package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Output;
import ecma.aif.warehouse.entitiy.OutputProduct;
import ecma.aif.warehouse.entitiy.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface OutputProductCustom {
    Integer getId();

    Product getProduct();

    Integer getAmount();

    Integer getPrice();

    Output getOutput();
}
