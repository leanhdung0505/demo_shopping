package com.example.service.impl;

import com.example.payload.ProductStyleDto;
import com.example.repository.ProductStyleRepository;
import com.example.service.ProductStyleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductStyleServiceImpl implements ProductStyleService {

    // Declare the repository as final to ensure its immutability
    private final ProductStyleRepository productstyleRepository;

    public ProductStyleServiceImpl(ProductStyleRepository productstyleRepository) {
        this.productstyleRepository = productstyleRepository;
    }

    public List<ProductStyleDto> getAllProductStyles() {
        return productstyleRepository.findAll();
    }

    public Optional<ProductStyleDto> getProductStyleById(int id) {
        return productstyleRepository.findById(id);
    }

    public ProductStyleDto saveProductStyle(ProductStyleDto productstyle) {
        return productstyleRepository.save(productstyle);
    }

    public void deleteProductStyle(int id) {
        productstyleRepository.deleteById(id);
    }
}
