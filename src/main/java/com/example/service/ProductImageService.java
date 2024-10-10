package com.example.service;

import com.example.payload.ProductImageDto;

import java.util.List;
import java.util.Optional;

public interface ProductImageService {
    List<ProductImageDto> getAllProductImages();

    Optional<ProductImageDto> getProductImageById(int id);

    ProductImageDto saveProductImage(ProductImageDto productimage);

    void deleteProductImage(int id);

}
