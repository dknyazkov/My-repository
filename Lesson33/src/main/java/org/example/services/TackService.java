package org.example.services;

import org.example.AppSessionFactory;
import org.example.domain.Person;
import org.example.domain.StatusOfTask;
import org.example.domain.Task;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TackService {
    public void saveTask(Task task) {
        try (Session session = AppSessionFactory.getSessionFactory()) {
            Transaction transaction = session.beginTransaction();
            session.save(task);
            transaction.commit();
        }
    }

    public Task getTask(Integer id) {
        try (Session session = AppSessionFactory.getSessionFactory()) {
            Transaction transaction = session.beginTransaction();
            Task task = session.find(Task.class, id);
            transaction.commit();
            return task;
        }
    }

    public List<Task> getPersonTask(Person person) {
        try (Session session = AppSessionFactory.getSessionFactory()) {
            Transaction transaction = session.beginTransaction();
            List<Task> tasks = person.getTasks();
            transaction.commit();
            return tasks;
        }
    }

    public void changeStatus(Task task, StatusOfTask status) {
        try (Session session = AppSessionFactory.getSessionFactory()) {
            Transaction transaction = session.beginTransaction();
            task.setStatus(status);
            transaction.commit();
        }
    }

}
