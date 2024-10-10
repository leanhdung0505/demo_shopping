package com.example.service;

import com.example.payload.SizeOptionDto;

import java.util.List;
import java.util.Optional;

public interface SizeOptionService {
    List<SizeOptionDto> getAllSizeOptions();

    Optional<SizeOptionDto> getSizeOptionById(int id);

    SizeOptionDto saveSizeOption(SizeOptionDto sizeoption);

    void deleteSizeOption(int id);
}
