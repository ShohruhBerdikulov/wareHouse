package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Suplier;
import ecma.aif.warehouse.entitiy.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Suplier.class)
public interface SuplierCustom {
    Integer getId();

    String getName();

    String getPhoneNumber();

    boolean getActive();
}
