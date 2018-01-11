package dev.apptizer.io.domain.projection;

import dev.apptizer.io.domain.Sale;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "expand", types = Sale.class)
interface SalesProjection {

    String getSalesId();

    String getDate();

    SalesAgentProjection getSalesAgent();

    List<ProductProjection> getProducts();
}
