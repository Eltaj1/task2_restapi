package com.restapi.apifirst.product.service;

import com.restapi.apifirst.product.api.request.request;
import com.restapi.apifirst.product.api.request.updaterequest;
import com.restapi.apifirst.product.api.response.responsepro;
import com.restapi.apifirst.product.repository.prorepository;
import com.restapi.apifirst.product.support.mapper;
import com.restapi.apifirst.product.support.exception.produsupplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servic {
    private final prorepository prorepository;
    private final mapper mapper;

    public servic(prorepository prorepository, mapper mapper) {
        this.prorepository = prorepository;
        this.mapper = mapper;
    }

    public responsepro create(request request) {
        var product = mapper.toProduct(request);
        var savedProduct = prorepository.save(product);
        return mapper.toProductResponse(savedProduct);
    }

    public responsepro find(Long id) {
        var product = prorepository.findById(id)
                .orElseThrow(produsupplier.productNotFound(id));
        return mapper.toProductResponse(product);
    }

    public responsepro update(Long id, updaterequest updaterequest) {
        var existingProduct = prorepository.findById(id)
                .orElseThrow(produsupplier.productNotFound(id));
        var updatedProduct = mapper.toProduct(updaterequest, existingProduct);
        var savedProduct = prorepository.save(updatedProduct);
        return mapper.toProductResponse(savedProduct);
    }

    public List<responsepro> findAll() {
        return prorepository.findAll().stream()
                .map(mapper::toProductResponse)
                .toList();
    }

    public void delete(Long id) {
        var product = prorepository.findById(id)
                .orElseThrow(produsupplier.productNotFound(id));
        prorepository.deleteById(id);
    }
}