package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @NotEmpty(message = "the column can not be empty")
    @NotNull(message = "the column can not be null")
    @NotBlank(message = "please,fill the column")
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return name;
    }


}
