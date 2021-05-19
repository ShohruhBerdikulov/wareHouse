package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Users;
import ecma.aif.warehouse.entitiy.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Users.class)
public interface UserCustom {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();
}
