package com.example.service;

import com.example.payload.ColorDto;

import java.util.List;
import java.util.Optional;

public interface ColorService {
    List<ColorDto> getAllColors();

    Optional<ColorDto> getColorById(int id);

    ColorDto saveColor(ColorDto color);

    void deleteColor(int id);


}
