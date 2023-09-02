package org.example;

import lombok.*;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Rider {
    private String name;
    private Integer age;
}
