package com.example.lesson46.service;

import com.example.lesson46.domain.CarDTO;
import com.example.lesson46.domain.CarEntity;
import com.example.lesson46.mapper.CarMapper;
import com.example.lesson46.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository repository;
    private final CarMapper mapper;

    @Override
    public List<CarDTO> getAll() {
        return mapper.toListDTO(repository.findAll());
    }

    @Override
    public CarDTO save(CarDTO carDTO) {
        CarEntity entity = mapper.toEntity(carDTO);
        CarEntity save = repository.save(entity);
        return mapper.toDTO(save);
    }

    @Override
    public CarDTO findById(UUID id) {
        return mapper.toDTO(repository.findById(id).orElseThrow(RuntimeException::new));

    }

    @Override
    public void deleteById(UUID id) {
        Optional<CarEntity> byId = repository.findById(id);
        if (byId.isPresent()) {
            repository.deleteById(id);
        }


    }

    @Transactional
    @Override
    public CarDTO update(UUID id, CarDTO carDTO) {
        var byId = repository.findById(id).orElseThrow(RuntimeException::new);
        mapper.update(byId,carDTO);
        return mapper.toDTO(byId);


    }
}



