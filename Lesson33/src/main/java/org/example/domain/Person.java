package org.example.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    @Enumerated(EnumType.STRING)
    TypeOfUser type;
    @Temporal(TemporalType.DATE)
    Date dateOfBirth;
    Boolean isMan;
    @OneToMany(mappedBy = "person")
    List<Task> tasks;

    public Person(String name, TypeOfUser type, Date dateOfBirth, Boolean isMan) {
        this.name = name;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.isMan = isMan;
    }
}
