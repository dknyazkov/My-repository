package com.example.lesson46.controller;

import com.example.lesson46.domain.CarDTO;
import com.example.lesson46.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class MyController {

    private final CarService service;

    @GetMapping
    public List<CarDTO> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CarDTO create(@RequestBody CarDTO carDTO) {
        return service.save(carDTO);

    }

    @GetMapping("/{id}")
    public CarDTO getById(@PathVariable(name = "id") UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(name = "id") UUID id) {
        service.deleteById(id);
    }

    @PutMapping({"/{id}"})
    public CarDTO update (@PathVariable(name = "id") UUID id, @RequestBody CarDTO carDTO) {
        return service.update(id,carDTO);

    }

}
