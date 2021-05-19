package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

public interface WarehouseCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
