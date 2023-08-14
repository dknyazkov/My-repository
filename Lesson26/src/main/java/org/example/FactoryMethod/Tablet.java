package org.example.FactoryMethod;

public class Tablet extends Computer {

    public Integer sizeOfScreen;

    public Tablet() {
    }

    public Tablet(String model, Integer sizeOfMemory, String cpu, Integer sizeOfScreen) {
        super(model, sizeOfMemory, cpu);
        this.sizeOfScreen = sizeOfScreen;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "sizeOfScreen=" + sizeOfScreen +
                ", model='" + model + '\'' +
                ", sizeOfMemory=" + sizeOfMemory +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
