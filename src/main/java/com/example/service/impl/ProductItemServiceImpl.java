package com.example.service.impl;


import com.example.payload.ProductItemDto;
import com.example.repository.ProductItemRepository;
import com.example.service.ProductItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductItemServiceImpl implements ProductItemService {

    // Declare the repository as final to ensure its immutability
    private final ProductItemRepository productitemRepository;

    public ProductItemServiceImpl(ProductItemRepository productitemRepository) {
        this.productitemRepository = productitemRepository;
    }

    public List<ProductItemDto> getAllProductItems() {
        return productitemRepository.findAll();
    }

    public Optional<ProductItemDto> getProductItemById(int id) {
        return productitemRepository.findById(id);
    }

    public ProductItemDto saveProductItem(ProductItemDto productitem) {
        return productitemRepository.save(productitem);
    }

    public void deleteProductItem(int id) {
        productitemRepository.deleteById(id);
    }
}

