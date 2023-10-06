package com.example.services;

import com.example.domain.StudentDTO;
import com.example.domain.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface StudentMapper {
    @Mapping(target = "id",source = "id")
    @Mapping(target = "name",source = "name")
    @Mapping(target = "age",source = "age")
    @Mapping(target = "university",source = "university")
    StudentEntity toEntity(StudentDTO dto);
    @Mapping(target = "id",source = "id")
    @Mapping(target = "name",source = "name")
    @Mapping(target = "age",source = "age")
    @Mapping(target = "university",source = "university")
    StudentDTO toDTO(StudentEntity entity);


    List<StudentDTO> toListDTO(List<StudentEntity> entity);
}
