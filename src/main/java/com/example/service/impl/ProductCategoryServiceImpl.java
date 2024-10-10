package com.example.service.impl;

import com.example.payload.ProductCategoryDto;
import com.example.repository.ProductCategoryRepository;
import com.example.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    // Declare the repository as final to ensure its immutability
    private final ProductCategoryRepository productcategoryRepository;


    public ProductCategoryServiceImpl(ProductCategoryRepository productcategoryRepository) {
        this.productcategoryRepository = productcategoryRepository;
    }

    public List<ProductCategoryDto> getAllProductCategorys() {
        return productcategoryRepository.findAll();
    }

    public Optional<ProductCategoryDto> getProductCategoryById(int id) {
        return productcategoryRepository.findById(id);
    }

    public ProductCategoryDto saveProductCategory(ProductCategoryDto productcategory) {
        return productcategoryRepository.save(productcategory);
    }

    public void deleteProductCategory(int id) {
        productcategoryRepository.deleteById(id);
    }
}
            