package org.example;

import org.example.domain.Person;
import org.example.domain.StatusOfTask;
import org.example.domain.Task;
import org.example.domain.TypeOfUser;
import org.example.services.PersonService;
import org.example.services.TackService;

import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        TackService tackService = new TackService();
        Person person = new Person("Ted", TypeOfUser.ADMIN, new Date(100, 8, 21), true);
        Person person1 = new Person("Bob", TypeOfUser.USER, new Date(81, 2, 3), true);
        Task task = new Task("Cleaning", "Home cleaning", StatusOfTask.IN_PROGRESS);
        Task task1 = new Task("TV", "Watching TV", StatusOfTask.NEW);
        Task task2 = new Task("Play", "Playing computer games", StatusOfTask.IN_PROGRESS);
        person.setTasks(List.of(task, task1));
        person1.setTasks(List.of(task2));
        personService.savePerson(person);
        personService.savePerson(person1);
        tackService.changeStatus(task2, StatusOfTask.IN_PROGRESS);
        personService.deletePerson(person);

        personService.withActiveTasks();

    }

}