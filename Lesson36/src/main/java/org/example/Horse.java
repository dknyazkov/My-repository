package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
@Scope("prototype")
public class Horse {

    private String name;

    private Integer age;
}
