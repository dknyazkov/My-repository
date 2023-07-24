package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
    public String login;
    public String password;
    public Integer age;
    public String email;

    public User() {
    }

    public User(String login, String password, Integer age, String email) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
    }
}
