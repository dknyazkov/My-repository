package org.example.FactoryMethod;

public class Computer {

    public String model;

    public Integer sizeOfMemory;
    public String cpu;

    public Computer() {
    }

    public Computer(String model, Integer sizeOfMemory, String cpu) {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSizeOfMemory() {
        return sizeOfMemory;
    }

    public void setSizeOfMemory(Integer sizeOfMemory) {
        this.sizeOfMemory = sizeOfMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}

