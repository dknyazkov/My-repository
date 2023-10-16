package com.example.lesson46_add.client;


import com.example.lesson46_add.domain.CarDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "car-client",url ="http://127.0.0.1:8081/cars")
public interface CarClient {
    @GetMapping
    List<CarDTO> getAll();

}
