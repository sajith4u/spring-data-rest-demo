package dev.apptizer.io.repo;

import dev.apptizer.io.domain.Sale;
import dev.apptizer.io.domain.SalesAgent;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "agents", path = "agents")
public interface SalesAgentRepository extends MongoRepository<SalesAgent, String> {

    List<SalesAgent> findByNameStartsWith(@Param("name") String name, Pageable p);
}
