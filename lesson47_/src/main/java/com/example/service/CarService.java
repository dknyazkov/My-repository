package com.example.service;

import com.example.domain.CarDTO;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface CarService {

    CarDTO findById(UUID id);

    List<CarDTO> getAll();

    @PostMapping
    CarDTO save(@Valid CarDTO carDTO);

}
