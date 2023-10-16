package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private UUID id;
    private Model model;
    private Integer power;
    Integer yearOfProduction;

}