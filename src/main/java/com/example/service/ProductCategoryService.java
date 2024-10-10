package com.example.service;

import com.example.payload.ProductCategoryDto;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryService {
    List<ProductCategoryDto> getAllProductCategorys();

    Optional<ProductCategoryDto> getProductCategoryById(int id);

    ProductCategoryDto saveProductCategory(ProductCategoryDto productcategory);

    void deleteProductCategory(int id);
}
