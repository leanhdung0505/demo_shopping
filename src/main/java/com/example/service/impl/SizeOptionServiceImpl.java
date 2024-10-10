package com.example.service.impl;

import com.example.payload.SizeOptionDto;
import com.example.repository.SizeOptionRepository;
import com.example.service.SizeOptionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeOptionServiceImpl implements SizeOptionService {

    // Declare the repository as final to ensure its immutability
    private final SizeOptionRepository sizeoptionRepository;

    public SizeOptionServiceImpl(SizeOptionRepository sizeoptionRepository) {
        this.sizeoptionRepository = sizeoptionRepository;
    }

    // Use constructor-based dependency injection


    public List<SizeOptionDto> getAllSizeOptions() {
        return sizeoptionRepository.findAll();
    }

    public Optional<SizeOptionDto> getSizeOptionById(int id) {
        return sizeoptionRepository.findById(id);
    }

    public SizeOptionDto saveSizeOption(SizeOptionDto sizeoption) {
        return sizeoptionRepository.save(sizeoption);
    }

    public void deleteSizeOption(int id) {
        sizeoptionRepository.deleteById(id);
    }
}
