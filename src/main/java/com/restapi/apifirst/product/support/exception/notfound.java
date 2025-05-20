package com.restapi.apifirst.product.support.exception;

public class notfound extends RuntimeException {
    public notfound(Long id) {
        super("Could not find product with id: " + id);
    }
}