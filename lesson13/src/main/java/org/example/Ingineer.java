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
    public int compareTo(Worker o) {
        if (this.calculateSalary()==o.calculateSalary())
            return 0;
        if (this.calculateSalary()<o.calculateSalary())
            return 1;
        return -1;
    }

    @Override
    public String toString() {
     return    "automatizer=" + automatizer +
                ", robotics=" + robotics +
                ", communications=" + communications +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExperience=" + workExperience +
                ", salary="+calculateSalary()+
                '}';
    }

    @Override
    public int calculateSalary() {
        return index * (workExperience + 1);
    }


}