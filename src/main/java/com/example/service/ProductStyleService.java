package com.example.service;

import com.example.payload.ProductStyleDto;

import java.util.List;
import java.util.Optional;

public interface ProductStyleService {
    List<ProductStyleDto> getAllProductStyles();

    Optional<ProductStyleDto> getProductStyleById(int id);

    ProductStyleDto saveProductStyle(ProductStyleDto productstyle);

    void deleteProductStyle(int id);
}
