package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Currensy;
import ecma.aif.warehouse.entitiy.Input;
import ecma.aif.warehouse.entitiy.Suplier;
import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();

    Date getDate();

    WareHouse getWareHouse();

    Currensy getCurrensy();

    Suplier getSuplier();

    Integer getFactureNumber();

    String getCode();
}
