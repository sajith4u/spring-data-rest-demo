package dev.apptizer.io.repo;

import dev.apptizer.io.domain.Product;
import dev.apptizer.io.domain.Sale;
import dev.apptizer.io.domain.SalesAgent;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "sales", path = "sales")
public interface SalesRepository extends MongoRepository<Sale, String> {

    @RestResource(path = "searchByAgent", rel = "searchByAgent")
    List<Sale> findBySalesAgentAgentId(@Param("agentId") String agentId, Pageable pageable);
}
