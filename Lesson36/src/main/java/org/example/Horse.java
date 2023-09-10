package org.example;

import lombok.*;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Horse {
    private String name;
    private Integer age;
}
