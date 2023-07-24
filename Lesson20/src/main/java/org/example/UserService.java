package org.example;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    static Map<String, User> passwordsUsers = new HashMap<>();

    public void addUser(String login, String password, Integer age, String email) {

        if (passwordsUsers.containsKey(login)) {
            throw new RuntimeException();
        }
        if (login.isBlank() || login.isEmpty() || password.isEmpty() || password.isBlank()) {
            throw new RuntimeException();
        }
        passwordsUsers.put(login, new User(login, password, age, email));

    }

    public void checkPassword(String login, String password) {
        if (passwordsUsers.containsKey(login)) {
            User user = passwordsUsers.get(login);
            if (user.password.equals(password)) {
                return;
            }


        }

        throw new RuntimeException();

    }

}


