package com.example.lesson46_add.service;

import com.example.lesson46_add.domain.CarDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CarServicesImpl implements CarService {

    private final RestTemplate template;
@Value("$client.cars")
    private String cars;
    @Override
    public CarDTO findById(UUID id) {
        return template.getForObject("http://127.0.0.1:8081/cars/" + id, CarDTO.class);


    }

    @Override
    public List<CarDTO> getAll() {
        return template.getForObject("http://127.0.0.1:8081/cars/",List.class);
    }


}
