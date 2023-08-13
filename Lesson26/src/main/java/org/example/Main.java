package org.example;

import org.example.FactoryMethod.ComputerService;
import org.example.FactoryMethod.DifferentComputerCreation;
import org.example.FactoryMethod.LaptopCreation;
import org.example.FactoryMethod.TypeOfComputers;
import org.example.Notify.CallService;
import org.example.Notify.Car;

import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        ComputerService computerService=new ComputerService();
        LaptopCreation laptopCreation=new LaptopCreation();
        DifferentComputerCreation differentComputerCreation=new DifferentComputerCreation();
        computerService.register(laptopCreation);
        System.out.println(differentComputerCreation.register(TypeOfComputers.pc));

        Car car=new Car("BMW","M5");
        car.addObserver(new CallService());

        car.setBroken(true,car);



    }
}
