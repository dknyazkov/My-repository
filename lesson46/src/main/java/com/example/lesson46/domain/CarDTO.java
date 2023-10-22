package com.example.lesson46.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "My car dto")
public class CarDTO {
    private UUID id;
    private Model model;
    private Integer power;
    Integer yearOfProduction;


}
