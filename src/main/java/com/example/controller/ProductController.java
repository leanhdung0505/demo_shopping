package com.example.controller;

import com.example.payload.ProductDto;
import com.example.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    // Declare the service as final to ensure its immutability
    private final ProductServiceImpl productServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return ResponseEntity.ok(productServiceImpl.getAllProducts());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable int id) {
        return productServiceImpl.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto product) {
        return ResponseEntity.ok(productServiceImpl.saveProduct(product));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable int id, @RequestBody ProductDto product) {
        return ResponseEntity.ok(productServiceImpl.saveProduct(product));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        productServiceImpl.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}