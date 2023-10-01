package com.example.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Data
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private   UUID id;

    private   String name;

    private Integer age;
    @Enumerated(EnumType.STRING)
    University university;

    public StudentEntity() {
    }

    public StudentEntity(UUID id, String name, Integer age, University university) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.university = university;
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
}


