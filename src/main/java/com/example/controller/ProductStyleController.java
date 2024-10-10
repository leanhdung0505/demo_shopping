package com.example.controller;

import com.example.payload.ProductStyleDto;
import com.example.service.impl.ProductStyleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/product_style")
public class ProductStyleController {

    // Declare the service as final to ensure its immutability
    private final ProductStyleServiceImpl productstyleServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ProductStyleDto>> getAllProductStyles() {
        return ResponseEntity.ok(productstyleServiceImpl.getAllProductStyles());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductStyleDto> getProductStyleById(@PathVariable int id) {
        return productstyleServiceImpl.getProductStyleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ProductStyleDto> createProductStyle(@RequestBody ProductStyleDto productstyle) {
        return ResponseEntity.ok(productstyleServiceImpl.saveProductStyle(productstyle));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductStyleDto> updateProductStyle(@PathVariable int id, @RequestBody ProductStyleDto productstyle) {
        return ResponseEntity.ok(productstyleServiceImpl.saveProductStyle(productstyle));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProductStyle(@PathVariable int id) {
        productstyleServiceImpl.deleteProductStyle(id);
        return ResponseEntity.noContent().build();
    }
}
