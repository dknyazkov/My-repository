package org.example;

abstract public class Worker implements Comparable<Worker>{
    String firstName;
    String lastName;
    Boolean isMan;
    Integer workExperience;
    int index;


    public Worker() {
    }

    public Worker(String firstName, String lastName, Boolean isMan, Integer workExperience, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMan = isMan;
        this.workExperience = workExperience;
        this.index = index;

    }

    public int calculateSalary() {
        return IndexOfPost.WORKER.getIndex() * (workExperience + 1);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getisMan() {
        return isMan;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public int getIndex() {
        return index;
    }
}
