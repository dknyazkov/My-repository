package com.example.controller;

import com.example.domain.CarDTO;
import com.example.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequiredArgsConstructor
@RestController
@RequestMapping("/main")
public class MainController {
    private final CarService service;
    @GetMapping("/car")
    public CarDTO getById(@RequestParam(name = "id")UUID id) {
        return service.findById(id);
    }

    @GetMapping("/cars")
    public List<CarDTO> getAll() {
        return service.getAll();
    }

@PostMapping
public CarDTO save(@RequestBody CarDTO carDTO) {
    return service.save(carDTO);

}



}
