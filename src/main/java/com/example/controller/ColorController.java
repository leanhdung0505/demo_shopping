package com.example.controller;


import com.example.payload.ColorDto;
import com.example.service.impl.ColorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/color")
public class ColorController {

    // Declare the service as final to ensure its immutability
    private final ColorServiceImpl colorServiceImpl;

    @GetMapping(value = "/")
    public ResponseEntity<List<ColorDto>> getAllColors() {
        return ResponseEntity.ok(colorServiceImpl.getAllColors());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ColorDto> getColorById(@PathVariable int id) {
        return colorServiceImpl.getColorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ColorDto> createColor(@RequestBody ColorDto color) {
        return ResponseEntity.ok(colorServiceImpl.saveColor(color));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ColorDto> updateColor(@PathVariable int id, @RequestBody ColorDto color) {
        return ResponseEntity.ok(colorServiceImpl.saveColor(color));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ColorDto> deleteColor(@PathVariable int id) {
        colorServiceImpl.deleteColor(id);
        return ResponseEntity.noContent().build();
    }
}

