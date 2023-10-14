package com.example.lesson46_add.service;

import com.example.lesson46_add.domain.CarDTO;

import java.util.List;
import java.util.UUID;

public interface CarService {

    CarDTO findById(UUID id);

    List<CarDTO> getAll();

}
