package com.restapi.apifirst.product.repository;

import com.restapi.apifirst.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prorepository extends JpaRepository<Product, Long> {
}