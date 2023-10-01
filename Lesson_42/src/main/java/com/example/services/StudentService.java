

package com.example.services;

import com.example.domain.StudentDTO;

import java.util.List;
public interface StudentService {
    void save(StudentDTO student);
    List<StudentDTO> getAll();
}