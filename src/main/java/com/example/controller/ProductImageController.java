package com.example.controller;


import com.example.payload.ProductImageDto;
import com.example.service.impl.ProductImageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/product_image")
public class ProductImageController {

    // Declare the service as final to ensure its immutability
    private final ProductImageServiceImpl productimageServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ProductImageDto>> getAllProductImages() {
        return ResponseEntity.ok(productimageServiceImpl.getAllProductImages());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductImageDto> getProductImageById(@PathVariable int id) {
        return productimageServiceImpl.getProductImageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ProductImageDto> createProductImage(@RequestBody ProductImageDto productimage) {
        return ResponseEntity.ok(productimageServiceImpl.saveProductImage(productimage));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductImageDto> updateProductImage(@PathVariable int id, @RequestBody ProductImageDto productimage) {
        return ResponseEntity.ok(productimageServiceImpl.saveProductImage(productimage));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProductImage(@PathVariable int id) {
        productimageServiceImpl.deleteProductImage(id);
        return ResponseEntity.noContent().build();
    }
}

