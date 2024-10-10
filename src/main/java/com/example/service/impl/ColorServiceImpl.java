package com.example.service.impl;


import com.example.payload.ColorDto;
import com.example.repository.ColorRepository;
import com.example.service.ColorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService {

    // Declare the repository as final to ensure its immutability
    private final ColorRepository colorRepository;

    public ColorServiceImpl(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    public List<ColorDto> getAllColors() {
        return colorRepository.findAll();
    }

    public Optional<ColorDto> getColorById(int id) {
        return colorRepository.findById(id);
    }

    public ColorDto saveColor(ColorDto color) {
        return colorRepository.save(color);
    }

    public void deleteColor(int id) {
        colorRepository.deleteById(id);
    }
}

