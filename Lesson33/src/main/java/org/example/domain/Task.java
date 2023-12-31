package org.example.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String description;
    @Version
    Integer version;
    @Enumerated(EnumType.STRING)
    StatusOfTask status;
    @ToString.Exclude
    @ManyToOne()
    Person person;

    public Task(String title, String description, StatusOfTask status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }
}
