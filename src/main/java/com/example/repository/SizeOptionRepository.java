package com.example.repository;

import com.example.payload.SizeOptionDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeOptionRepository extends JpaRepository<SizeOptionDto, Integer> {
}
