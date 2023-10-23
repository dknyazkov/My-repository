package com.example.domain;

import com.example.valid.CheckPower;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@CheckPower
public class CarDTO {
    private UUID id;
    private Model model;
    private Integer power;
    Integer yearOfProduction;

}