package org.example.services;

import java.util.List;

import org.example.AppSessionFactory;
import org.example.domain.Person;
import org.example.domain.StatusOfTask;
import org.example.domain.Task;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonService {
    public PersonService() {
    }

    public void savePerson(Person person) {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }


    public void deletePerson(Person person) {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.delete(person);
        List<Task> tasks = person.getTasks();
        transaction.commit();
        session.close();


    }

    public Person getPerson(Integer id) {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        Person person = (Person) session.find(Person.class, id);
        transaction.commit();
        session.close();
        return person;
    }

    public void withActiveTasks() {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        List<Person> list = session.createQuery("select p from Task as t join t.person as p where t.status!=:st").setParameter("st", StatusOfTask.DONE).list();
        System.out.println(list);
        transaction.commit();
        session.close();
    }

    public Person updatePerson(Integer id, String newName) {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        Person person = (Person) session.find(Person.class, id);
        person.setName(newName);
        transaction.commit();
        session.close();
        return person;
    }
}
