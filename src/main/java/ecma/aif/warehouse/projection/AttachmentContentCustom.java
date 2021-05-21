package ecma.aif.warehouse.projection;

import ecma.aif.warehouse.entitiy.Attachment;
import ecma.aif.warehouse.entitiy.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentCustom {
    Integer getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
