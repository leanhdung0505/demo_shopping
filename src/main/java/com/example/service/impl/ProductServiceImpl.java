package com.example.service.impl;

import com.example.payload.ProductDto;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    // Declare the repository as final to ensure its immutability
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductDto> getProductById(int id) {
        return productRepository.findById(id);
    }

    public ProductDto saveProduct(ProductDto product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
