package org.example;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Scope("prototype")
public class Rider {
    private String name;
    private Integer age;
}
