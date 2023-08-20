package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class StudentCreateService {
public Student create (String name, String place, Integer age, Faculty faculty, Boolean isMan,University university,Date date)
{ Student student = new Student();
    student.setAge(age);
    student.setUniversity(university);
    student.setFaculty(faculty);
    student.setPlace(place);
    student.setName(name);
    student.setMan(isMan);
    student.setDateOfBirth(date);
return student;}


    public void save(Student student) {
        Session session = AppSessionFactory.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();

    }
}
