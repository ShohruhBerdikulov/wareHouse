package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface WarehouseCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
