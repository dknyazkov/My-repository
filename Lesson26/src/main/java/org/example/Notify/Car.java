package org.example.Notify;

import java.util.Observable;

public class Car extends Observable {
String brand;
String model;
Boolean isBroken=false;


    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBroken(Boolean broke,Car car) {
        setChanged();
        notifyObservers(car);
        isBroken = broke;

    }

    @Override
    public String toString() {
        return "Car " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'';
    }
}
