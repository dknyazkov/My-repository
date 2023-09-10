package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Car car=new Car();
            Car car1=new Car();
Owner owner=new Owner();
car.setModel("BMW");
car.setDriver("Ted");
Description description=new Description();
        Description description1=new Description();
        Description description2=new Description();
description.setPrint("print");
description.setDescription("Cool car");
car.setOwner(owner);
car1.setOwner(owner);
OwnerService ownerService=new OwnerService();
CarService carService=new CarService();
//car.setDetail(description);
car.setDetail(List.of(description,description2,description1));
owner.setCars(List.of(car,car1));
        Car db = carService.findDB(1, Car.class);


        Session session = AppSessionFactory_.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.save(description);
        session.save(owner);
        carService.save(car1);
        session.save(description1);
        session.save(description2);
        session.save(car);
            transaction.commit();
            session.close();


    }
}