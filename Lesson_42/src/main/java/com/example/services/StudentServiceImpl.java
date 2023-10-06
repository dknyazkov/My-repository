


package com.example.services;

import com.example.domain.StudentDTO;
import com.example.domain.StudentEntity;
import com.example.repository.StudentRepository;
import com.example.services.StudentMapper;
import com.example.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper mapper;
    private final StudentRepository repository;
    public List<StudentEntity> all;
    @Override
    public void save(StudentDTO student) {
        StudentEntity entity = mapper.toEntity(student);
        repository.save(entity);

    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> all = repository.findAll();
        return mapper.toListDTO(all);
    }
}