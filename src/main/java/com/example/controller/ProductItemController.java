package com.example.controller;


import com.example.payload.ProductItemDto;
import com.example.service.impl.ProductItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/product_item")
public class ProductItemController {

    // Declare the service as final to ensure its immutability
    private final ProductItemServiceImpl productitemServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ProductItemDto>> getAllProductItems() {
        return ResponseEntity.ok(productitemServiceImpl.getAllProductItems());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductItemDto> getProductItemById(@PathVariable int id) {
        return productitemServiceImpl.getProductItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ProductItemDto> createProductItem(@RequestBody ProductItemDto productitem) {
        return ResponseEntity.ok(productitemServiceImpl.saveProductItem(productitem));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductItemDto> updateProductItem(@PathVariable int id, @RequestBody ProductItemDto productitem) {
        return ResponseEntity.ok(productitemServiceImpl.saveProductItem(productitem));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProductItem(@PathVariable int id) {
        productitemServiceImpl.deleteProductItem(id);
        return ResponseEntity.noContent().build();
    }
}

