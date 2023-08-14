package org.example.FactoryMethod;

public class TabletCreation implements ComputerCreation {

    @Override
    public Computer create() {
        return new Tablet();
    }
}
