package org.example;


import java.util.HashSet;

public class Director extends Worker {
    HashSet<Worker> employeeOfDirector = new HashSet<>();
    boolean isExist;

    public Director(String firstName, String lastName, Boolean isMan, Integer workExperience, int index) {
        super(firstName, lastName, isMan, workExperience, index);
    }


    public Director() {
    }


    public int calculateSalary() {
        return index * (workExperience + 1) + (employeeOfDirector.size() * 100);

    }

    public void addEmployee(Worker worker) {
        employeeOfDirector.add(worker);
    }


    public boolean findEmployee(String firstName, Director director) {
        for (Worker worker : director.employeeOfDirector
        ) {
            if (worker.getFirstName().equals(firstName)) {
                return true;
            }
        }
        return false;
    }


    public boolean findEmployeeAll(String firstName, Director director) {
        if (!(findEmployee(firstName, director))) {
            for (Worker worker : director.employeeOfDirector
            ) {
                if (worker.getFirstName().equals(firstName)) {
                    return true;
                } else if (worker instanceof Director) {
                    director = (Director) worker;
                    findEmployeeAll(firstName, director);
                }

            }

        } else isExist = true;
        return isExist;
    }

    @Override
    public String toString() {
        return "Director{" +
                ", isExist=" + isExist +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExperience=" + workExperience +
                ", salary="+calculateSalary()+
                '}';
    }
    @Override
    public int compareTo(Worker o) {
        if (this.calculateSalary()==o.calculateSalary())
            return 0;
        if (this.calculateSalary()<o.calculateSalary())
            return 1;
        return -1;
    }

}


