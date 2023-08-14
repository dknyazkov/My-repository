package org.example.FactoryMethod;

public class LaptopCreation implements ComputerCreation {
    @Override
    public Computer create() {
        return new Laptop();
    }
}
