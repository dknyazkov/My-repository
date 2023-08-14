package org.example.domain;

import lombok.Data;
import org.example.domain.Activities;

import java.util.ArrayList;
import java.util.List;

@Data
public class Client {
    public String login;
    public String password;
    public Integer age;
    public String email;
    public List<Activities> listOfActivities = new ArrayList<>();



    public Client(String login, String password, Integer age, String email, List<Activities> listOfActivities) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
        this.listOfActivities = listOfActivities;
    }

    public Integer getSize() {
        return listOfActivities.size();
    }

    public Client() {
    }

    public List<Activities> getActivities() {
        return listOfActivities;
    }


    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


