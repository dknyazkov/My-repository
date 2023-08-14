package org.example.FactoryMethod;

public class DifferentComputerCreation {

    public Computer register(TypeOfComputers type) {
        if (type == TypeOfComputers.laptop)
            return new Laptop();
        else if (type == TypeOfComputers.tablet)
            return new Laptop();
        else if (type == TypeOfComputers.pc)
            return new PC();
        return null;
    }


}

