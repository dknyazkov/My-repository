
package com.example.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class StudentDTO {
    private UUID id;
    private String name;
    private Integer age;
    private University university;
    public  Integer order;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public StudentDTO() {
    }

    public StudentDTO(UUID id, String name, Integer age, University university) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.university = university;
        this.order=order;


    }
}