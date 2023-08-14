package org.example.FactoryMethod;

public class Laptop extends Computer {

    String manufacture;

    public Laptop() {
    }

    public Laptop(String model, Integer sizeOfMemory, String cpu, String manufacture) {
        super(model, sizeOfMemory, cpu);
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", sizeOfMemory=" + sizeOfMemory +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}