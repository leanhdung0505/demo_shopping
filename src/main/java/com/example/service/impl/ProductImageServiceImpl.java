package com.example.service.impl;


import com.example.payload.ProductImageDto;
import com.example.repository.ProductImageRepository;
import com.example.service.ProductImageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageServiceImpl implements ProductImageService {

    // Declare the repository as final to ensure its immutability
    private final ProductImageRepository productimageRepository;


    public ProductImageServiceImpl(ProductImageRepository productimageRepository) {
        this.productimageRepository = productimageRepository;
    }

    public List<ProductImageDto> getAllProductImages() {
        return productimageRepository.findAll();
    }

    public Optional<ProductImageDto> getProductImageById(int id) {
        return productimageRepository.findById(id);
    }

    public ProductImageDto saveProductImage(ProductImageDto productimage) {
        return productimageRepository.save(productimage);
    }

    public void deleteProductImage(int id) {
        productimageRepository.deleteById(id);
    }
}

