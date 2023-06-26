package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) throws IOException {
        Director director1 = new Director("Ted", "Mosby", true, 4, IndexOfPost.GENERALDIRECTOR.getIndex());
        Director director2 = new Director("Barny", "Stinson", true, 2, IndexOfPost.FINDIRECTOR.getIndex());
        Director director3 = new Director("Marshall", "Ericsson", true, 5, IndexOfPost.DEPARTMENTDIRECTOR.getIndex());
        Director director4 = new Director("Lily", "Aldrin", false, 1, IndexOfPost.FINDIRECTOR.getIndex());
        Ingineer engineer1 = new Ingineer("Rachel", "Green", false, 4, IndexOfPost.AUTOMATIZER.getIndex());
        Ingineer engineer2 = new Ingineer("Joey", "Tribbiani", true, 7, IndexOfPost.COMMUNICATION.getIndex());
        Ingineer engineer3 = new Ingineer("Monica", "Geller", false, 3, IndexOfPost.COMMUNICATION.getIndex());
        Ingineer engineer4 = new Ingineer("Phoebe", "Buffay", false, 4, IndexOfPost.ROBOTICS.getIndex());
        Ingineer engineer5 = new Ingineer("Ursula", "Buffay", false, 7, IndexOfPost.AUTOMATIZER.getIndex());
        Ingineer engineer6 = new Ingineer("Chandler", "Bing", true, 9, IndexOfPost.ROBOTICS.getIndex());
        Ingineer engineer7 = new Ingineer("Ross", "Geller", true, 0, IndexOfPost.COMMUNICATION.getIndex());
        Ingineer engineer8 = new Ingineer("Ghunter", "", true, 12, IndexOfPost.AUTOMATIZER.getIndex());
        Ingineer engineer9 = new Ingineer("Janice", "", false, 6, IndexOfPost.COMMUNICATION.getIndex());
        director1.addEmployee(director2);
        director1.addEmployee(director3);
        director1.addEmployee(engineer1);
        director1.addEmployee(engineer2);
        director2.addEmployee(engineer3);
        director2.addEmployee(engineer4);
        director3.addEmployee(director4);
        director3.addEmployee(engineer5);
        director3.addEmployee(engineer6);
        director4.addEmployee(engineer7);
        director4.addEmployee(engineer8);
        director4.addEmployee(engineer9);

        System.out.println(director1.calculateSalary());
        System.out.println(engineer2.calculateSalary());

        System.out.println(director1.findEmployee("Chandler", director3));
        System.out.println(director1.findEmployeeAll("Ross", director4));
        System.out.println(director1);


    }
}