package com.example.repository;


import com.example.payload.ProductImageDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImageDto, Integer> {
}

