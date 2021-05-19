package ecma.aif.warehouse.repository;

import ecma.aif.warehouse.entitiy.Category;
import ecma.aif.warehouse.entitiy.Client;
import ecma.aif.warehouse.projection.CategoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "category", collectionResourceRel = "list",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
