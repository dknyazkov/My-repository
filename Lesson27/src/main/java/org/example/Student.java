package org.example;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private boolean isMan;
    private String name;
    @Column(name = "city")
    String place;
    private Integer age;
    @Enumerated(EnumType.STRING)
    Faculty faculty;
    @Embedded
    private University university;

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }


    public void setUniversity(University university) {
        this.university = university;
    }


}
