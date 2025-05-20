package com.restapi.apifirst.product.support.exception;

import java.util.function.Supplier;

public class produsupplier {
    public static Supplier<notfound> productNotFound(Long id) {
        return () -> new notfound(id);
    }
}