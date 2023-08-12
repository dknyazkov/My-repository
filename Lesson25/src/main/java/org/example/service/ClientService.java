package org.example.service;

import org.example.domain.Activities;
import org.example.domain.Client;
import org.example.exceptions.ClientNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClientService {
    public static Map<String, Client> clientMap = new HashMap<>();
    public static Activities gettingUp = new Activities("Getting up");

    public static Activities readingABook = new Activities("Reading a book");
    public static Activities cleaningAFlat = new Activities("Cleaning a flat");
    public static Activities cooking = new Activities("Cooking");
    public static Activities goingForAWalk = new Activities("Going for a walk");
    public static Activities playingFootball = new Activities("Playing football");
    public static Activities gettingAShower = new Activities("Getting a shower");

    static {
        clientMap.put("Ted", new Client("Ted", "12345", 24, "ted@mail.ru", new ArrayList<>()));
        clientMap.put("Bob", new Client("Bob", "qwe", 32, "bob@mail.ru", new ArrayList<>()));
    }

    static {
        Client ted = clientMap.get("Ted");
        Client bob = clientMap.get("Bob");
        ted.listOfActivities.add(gettingAShower);
        ted.listOfActivities.add(gettingUp);
        ted.listOfActivities.add(readingABook);
        ted.listOfActivities.add(cooking);
        ted.listOfActivities.add(playingFootball);

        bob.listOfActivities.add(gettingUp);
        bob.listOfActivities.add(cleaningAFlat);
        bob.listOfActivities.add(goingForAWalk);
        bob.listOfActivities.add(gettingAShower);

    }

    public void addUser(String login, String password, Integer age, String email) {

        if (clientMap.containsKey(login)) {
            throw new RuntimeException();
        }
        clientMap.put(login, new Client(login, password, age, email, new ArrayList<Activities>()));

    }

    public void checkPassword(String login, String password) {
        if (clientMap.containsKey(login)) {
            Client client = clientMap.get(login);
            if (client.password.equals(password)) {
                return;
            }


        }
        throw new ClientNotFoundException();
    }

}
