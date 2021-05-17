package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Attachment;
import ecma.aif.warehouse.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "attachment", collectionResourceRel = "list")
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
