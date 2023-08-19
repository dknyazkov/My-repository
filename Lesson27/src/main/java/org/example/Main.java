package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.PostgreSQL95Dialect;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StudentCreateService studentCreateService = new StudentCreateService();
        University university = new University();
        university.setTitle("BGU");
        studentCreateService.save("John", "Moscow", 20, Faculty.MATH, true, university,new Date(100,9,01));
    }
}