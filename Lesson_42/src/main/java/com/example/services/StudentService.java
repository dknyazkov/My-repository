

package com.example.services;

import com.example.domain.StudentDTO;
import com.example.domain.StudentEntity;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    void save(StudentDTO student);

    List<StudentDTO> getAll();

    List<StudentDTO> orderBy();

    void increase(UUID id);

    void decrease(UUID id);

    List<StudentDTO> findByText(StudentSearchService studentSearchService);
}