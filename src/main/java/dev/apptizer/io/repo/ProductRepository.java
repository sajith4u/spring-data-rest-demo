package dev.apptizer.io.repo;

import dev.apptizer.io.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {

    @RestResource(path = "names", rel = "demo1")
    List<Product> findByName(@Param("name") String name);


    @RestResource(path = "similar", rel = "demo")
    List<Product> findByNameLike(@Param("name") String name);

    @Override
    @RestResource(exported = true)
    void delete(String productId);
}
