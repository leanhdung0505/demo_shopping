package com.example.repository;

import com.example.payload.ProductItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItemDto, Integer> {
}

