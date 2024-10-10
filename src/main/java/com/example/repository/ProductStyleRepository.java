package com.example.repository;

import com.example.payload.ProductStyleDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStyleRepository extends JpaRepository<ProductStyleDto, Integer> {
}
