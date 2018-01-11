package dev.apptizer.io.domain.projection;


import dev.apptizer.io.domain.SalesAgent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

interface SalesAgentProjection {

    int getAge();

    String getAgentId();

    @Value("#{target.name} #{target.lastName}")
    String getFullName();
}
