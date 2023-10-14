package com.example.services;

import com.example.domain.University;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentSearchService {
    private String name;
    private Integer age;
    private University university;
}
