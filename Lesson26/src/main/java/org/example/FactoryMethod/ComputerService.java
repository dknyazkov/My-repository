package org.example.FactoryMethod;

public class ComputerService {

    public void register(ComputerCreation computerCreation) {
        Computer computer = computerCreation.create();
        System.out.println(computer);

    }
}
