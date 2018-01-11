package dev.apptizer.io.domain.projection;

import dev.apptizer.io.domain.Product;
import org.springframework.data.rest.core.config.Projection;


interface ProductProjection {

    String getProductId();

    String getName();

    String getPrice();
}
