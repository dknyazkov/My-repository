package org.example;

public class Ingineer extends Worker {
    IndexOfPost automatizer = IndexOfPost.AUTOMATIZER;
    IndexOfPost robotics = IndexOfPost.ROBOTICS;

    IndexOfPost communications = IndexOfPost.COMMUNICATION;

    public IndexOfPost getAutomatizer() {
        return automatizer;
    }

    public IndexOfPost getRobotics() {
        return robotics;
    }

    public IndexOfPost getCommunications() {
        return communications;
    }

    public Ingineer(String firstName, String lastName, Boolean isMan, Integer workExperience, int index) {
        super(firstName, lastName, isMan, workExperience, index);
    }

    @Override
    public int calculateSalary() {
        return index * (workExperience + 1);
    }
}