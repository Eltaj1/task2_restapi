package com.restapi.apifirst.product.api;

import com.restapi.apifirst.product.api.request.request;
import com.restapi.apifirst.product.api.request.updaterequest;
import com.restapi.apifirst.product.api.response.responsepro;
import com.restapi.apifirst.product.service.servic;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class controllerpro {
    private final servic servic;

    public controllerpro(servic servic) {
        this.servic = servic;
    }

    @Operation(summary = "Create product")
    @PostMapping
    public ResponseEntity<responsepro> create(@RequestBody request request) {
        var response = servic.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Operation(summary = "Find product by id")
    @GetMapping("/{id}")
    public ResponseEntity<responsepro> find(@PathVariable Long id) {
        var response = servic.find(id);
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Update product by id")
    @PutMapping("/{id}")
    public ResponseEntity<responsepro> update(@PathVariable Long id, @RequestBody updaterequest updaterequest) {
        var response = servic.update(id, updaterequest);
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Find all products")
    @GetMapping
    public ResponseEntity<List<responsepro>> findAll() {
        var response = servic.findAll();
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Delete product by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        servic.delete(id);
        return ResponseEntity.noContent().build();
    }
}