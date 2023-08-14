package org.example.FactoryMethod;

public class PC extends Computer {
    public String model;

    public Integer sizeOfMemory;
    public String cpu;


    public PC() {
    }

    public PC(String model, Integer sizeOfMemory, String cpu) {
        this.model = model;
        this.sizeOfMemory = sizeOfMemory;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", sizeOfMemory=" + sizeOfMemory +
                ", cpu='" + cpu + '\'' +
                '}';
    }


}
