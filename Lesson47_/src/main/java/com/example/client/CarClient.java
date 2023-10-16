package com.example.client;


import com.example.domain.CarDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "car-client",url ="http://127.0.0.1:8081/cars")
public interface CarClient {
    @GetMapping
    List<CarDTO> getAll();
    @GetMapping
    CarDTO findById(UUID id);

    @PostMapping
    CarDTO save(@RequestBody CarDTO carDTO);
}
