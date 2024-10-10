package com.example.repository;


import com.example.payload.ColorDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<ColorDto, Integer> {
}
