package com.example.controller;

import com.example.payload.ProductCategoryDto;
import com.example.service.impl.ProductCategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/product_category")
public class ProductCategoryController {

    // Declare the service as final to ensure its immutability
    private final ProductCategoryServiceImpl productcategoryServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ProductCategoryDto>> getAllProductCategorys() {
        return ResponseEntity.ok(productcategoryServiceImpl.getAllProductCategorys());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductCategoryDto> getProductCategoryById(@PathVariable int id) {
        return productcategoryServiceImpl.getProductCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ProductCategoryDto> createProductCategory(@RequestBody ProductCategoryDto productcategory) {
        return ResponseEntity.ok(productcategoryServiceImpl.saveProductCategory(productcategory));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductCategoryDto> updateProductCategory(@PathVariable int id, @RequestBody ProductCategoryDto productcategory) {
        return ResponseEntity.ok(productcategoryServiceImpl.saveProductCategory(productcategory));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProductCategory(@PathVariable int id) {
        productcategoryServiceImpl.deleteProductCategory(id);
        return ResponseEntity.noContent().build();
    }
}