package com.example.controller;

import com.example.payload.SizeOptionDto;
import com.example.service.impl.SizeOptionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/size_option")
public class SizeOptionController {

    // Declare the service as final to ensure its immutability
    private final SizeOptionServiceImpl sizeoptionServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<SizeOptionDto>> getAllSizeOptions() {
        return ResponseEntity.ok(sizeoptionServiceImpl.getAllSizeOptions());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SizeOptionDto> getSizeOptionById(@PathVariable int id) {
        return sizeoptionServiceImpl.getSizeOptionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<SizeOptionDto> createSizeOption(@RequestBody SizeOptionDto sizeoption) {
        return ResponseEntity.ok(sizeoptionServiceImpl.saveSizeOption(sizeoption));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<SizeOptionDto> updateSizeOption(@PathVariable int id, @RequestBody SizeOptionDto sizeoption) {
        return ResponseEntity.ok(sizeoptionServiceImpl.saveSizeOption(sizeoption));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteSizeOption(@PathVariable int id) {
        sizeoptionServiceImpl.deleteSizeOption(id);
        return ResponseEntity.noContent().build();
    }
}
