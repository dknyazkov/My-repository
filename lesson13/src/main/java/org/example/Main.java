package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

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
        HashMap<Worker, Integer> hashMap = new HashMap<>();
        HashSet<Worker> set = new HashSet<>();
        TreeSet<Worker> treeSet=new TreeSet<>();
        treeSet.add(director1);
        treeSet.add(director2);
        treeSet.add(director3);
        treeSet.add(engineer1);
        treeSet.add(engineer2);
        treeSet.add(engineer3);
        treeSet.add(engineer4);
        treeSet.add(director4);
        treeSet.add(engineer5);
        treeSet.add(engineer6);
        treeSet.add(engineer7);
        treeSet.add(engineer8);
        treeSet.add(engineer9);
        set.add(director1);
        set.add(director2);
        set.add(director3);
        set.add(engineer1);
        set.add(engineer2);
        set.add(engineer3);
        set.add(engineer4);
        set.add(director4);
        set.add(engineer5);
        set.add(engineer6);
        set.add(engineer7);
        set.add(engineer8);
        set.add(engineer9);

        int countOfDir = 0;
        int countOfEng = 0;

        for (Worker worker : set) {
            if (worker instanceof Director) {

                countOfDir++;
                if (hashMap.get(worker.getClass()) == null) {

                    hashMap.put(worker, countOfDir);
                } else {
                    hashMap.replace(worker, countOfDir);
                }
            } else {
                countOfEng++;
                if (hashMap.get(worker.getClass()) == null) {

                    hashMap.put(worker, countOfEng);
                } else {
                    hashMap.replace(worker, countOfEng);
                }
            }
        }
        System.out.printf("Количество директоров - %d\nКоличество инженеров - %d\n", countOfDir, countOfEng);

        System.out.println(director1.calculateSalary());
        System.out.println(engineer2.calculateSalary());

        System.out.println(director1.findEmployee("Chandler", director3));
        System.out.println(director1.findEmployeeAll("Ross", director4));
        System.out.println(director1);
        System.out.println(treeSet);

    }
}