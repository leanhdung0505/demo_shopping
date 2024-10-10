package com.example.repository;

import com.example.payload.ProductCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryDto, Integer> {
}
