package com.example.lesson46.controller;

import com.example.lesson46.service.CarService;
import com.example.lesson46.domain.CarDTO;
import com.example.lesson46.domain.ErrorResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
@OpenAPIDefinition(info = @Info(title = "My controller", description = "My controller works with object cars", version = "1.1"))
public class MyController {

    private final CarService service;

    @GetMapping
    @Operation(tags = "get",summary = "get all")
    public List<CarDTO> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(description = "This endpoint save users to DB",summary = "save user",tags = "other action")
    public CarDTO save(@RequestBody CarDTO carDTO) {
        return service.save(carDTO);

    }

    @GetMapping("/{id}")
    @Operation(tags = "get",summary = "get by id")
    public CarDTO getById(@PathVariable(name = "id") UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    @Operation(tags = "other action",summary = "delete by id")
    public void deleteById(@PathVariable(name = "id") UUID id) {
        service.deleteById(id);
    }

    @PutMapping({"/{id}"})
    @Operation(tags = "other action",summary = "update")
    @ApiResponse(description = "if the operation was success",responseCode ="202")
    @ApiResponse(description = "if the operation was failed",responseCode ="405",content = @Content(schema=@Schema(implementation = ErrorResponse.class)))
    public CarDTO update(@PathVariable(name = "id") UUID id, @RequestBody CarDTO carDTO) {
        return service.update(id, carDTO);

    }

}
