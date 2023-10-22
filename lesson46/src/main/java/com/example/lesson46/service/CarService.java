package com.example.lesson46.service;

import com.example.lesson46.domain.CarDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface CarService {
    List<CarDTO> getAll();
    CarDTO save(CarDTO carDTO);

    CarDTO findById(UUID id);

    void deleteById(UUID id);

    CarDTO update(UUID id,CarDTO carDTO);
}
