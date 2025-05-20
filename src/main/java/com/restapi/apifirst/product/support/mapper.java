package com.restapi.apifirst.product.support;

import com.restapi.apifirst.product.api.request.request;
import com.restapi.apifirst.product.api.request.updaterequest;
import com.restapi.apifirst.product.api.response.responsepro;
import com.restapi.apifirst.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class mapper {
    public Product toProduct(request request) {
        return new Product(null, request.name());
    }

    public Product toProduct(updaterequest updaterequest, Product existingProduct) {
        return new Product(existingProduct.getId(), updaterequest.name());
    }

    public responsepro toProductResponse(Product product) {
        return new responsepro(product.getId(), product.getName());
    }
}