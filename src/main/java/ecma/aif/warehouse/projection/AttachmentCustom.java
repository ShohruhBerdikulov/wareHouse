package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Attachment;
import ecma.aif.warehouse.entitiy.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentCustom {
    Integer getId();

    String getName();

    Integer getSize();

    String getContentType();
}
