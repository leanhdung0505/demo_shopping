package com.example.service;

import com.example.payload.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDto> getAllProducts();

    Optional<ProductDto> getProductById(int id);

    ProductDto saveProduct(ProductDto product);

    void deleteProduct(int id);

}
