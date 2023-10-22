package com.example.service;

import com.example.client.CarClient;
import com.example.domain.CarDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Validated
public class CarServicesImpl implements CarService {

    private final CarClient carClient;
    @Value("$client.cars")
    private String cars;

    @Override
    public CarDTO findById(UUID id) {
        return carClient.findById(id);

    }


    @Override
    public List<CarDTO> getAll() {
        return carClient.getAll();

    }

    @Override
    public CarDTO save(CarDTO carDTO) {
        return carClient.save(carDTO);
    }


}
