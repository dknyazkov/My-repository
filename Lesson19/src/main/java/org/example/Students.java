package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Students {
    Integer id;
    String name;
    Integer age;
    boolean isMan;

    public Students(Integer id, String name,Boolean isMan)
    {this.id=id;
        this.name=name;
        this.isMan=isMan;
    }
}