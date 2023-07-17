package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Driver driver=new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        try( Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/new", "postgres", "postgres")) {
            Statement statement = connection.createStatement();
            statement.execute("create table students (id int primary key,name varchar(25),age int, is_Man boolean)");
            statement.execute("insert into students (id,name,age,is_man) values  (1,'Ted',25,true), (2,'Anna',19,false),(3,'Bob',23,true),(4,'Mark',22,true),( 5, 'Sofia',21,false )");
            List<Students> students = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                Students student = new Students();
                student.id = resultSet.getInt("id");
                student.name = resultSet.getString("name");
                student.age = resultSet.getInt("age");
                student.isMan = resultSet.getBoolean("is_man");
                students.add(student);

            }


            System.out.println(students);
        }
    }




}