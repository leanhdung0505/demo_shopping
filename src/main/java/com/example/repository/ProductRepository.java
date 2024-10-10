package com.example.repository;

import com.example.payload.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDto, Integer> {
}
