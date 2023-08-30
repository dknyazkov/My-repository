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
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    List<Task> tasks;

    public Person(String name, TypeOfUser type, Date dateOfBirth, Boolean isMan) {
        this.name = name;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.isMan = isMan;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        tasks.stream()
                .forEach(task -> task.setPerson(this));
    }

    @PrePersist
    public void prePersist() {
        System.out.println("Call prePersist");
    }

    @PostPersist
    public void postPersist() {
        System.out.println("Call postPersist");
    }
}
