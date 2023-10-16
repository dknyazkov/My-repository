package com.example.service;

import com.example.domain.CarDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

public interface CarService {

    CarDTO findById(UUID id);

    List<CarDTO> getAll();

    @PostMapping
    public CarDTO save(CarDTO carDTO);

}
