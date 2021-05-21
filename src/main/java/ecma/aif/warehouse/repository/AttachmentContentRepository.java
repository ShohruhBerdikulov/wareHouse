package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Attachment;
import ecma.aif.warehouse.entitiy.AttachmentContent;
import ecma.aif.warehouse.projection.AttachmentContentCustom;
import ecma.aif.warehouse.projection.AttachmentCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "list", excerptProjection = AttachmentContentCustom.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
