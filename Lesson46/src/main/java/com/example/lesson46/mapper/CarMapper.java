package com.example.lesson46.mapper;

import com.example.lesson46.domain.CarDTO;
import com.example.lesson46.domain.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    @Mapping(target = "id",source = "id")
    @Mapping(target = "model",source = "model")
    @Mapping(target = "power",source = "power")
    @Mapping(target = "yearOfProduction",source = "yearOfProduction")
    CarEntity toEntity(CarDTO dto);
    @Mapping(target = "id",source = "id")
    @Mapping(target = "model",source = "model")
    @Mapping(target = "power",source = "power")
    @Mapping(target = "yearOfProduction",source = "yearOfProduction")
    CarDTO toDTO(CarEntity entity);


    List<CarDTO> toListDTO(List<CarEntity> entity);
    List<CarEntity> toListEntity(List<CarDTO> dto);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "model",source = "model")
    @Mapping(target = "power",source = "power")
    @Mapping(target = "yearOfProduction",source = "yearOfProduction")
    void update(@MappingTarget CarEntity carEntity, CarDTO carDTO);

}
