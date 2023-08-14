package org.example.FactoryMethod;

public class PCCreation implements ComputerCreation {

    @Override
    public Computer create() {
        return new PC();
    }


}
