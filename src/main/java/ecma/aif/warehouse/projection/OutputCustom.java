package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputCustom {
    Integer getId();

    Date getDate();

    WareHouse getWareHouse();

    Currensy getCurrensy();

    Client getClient();

    Integer getFactureNumber();

    String getCode();
}
