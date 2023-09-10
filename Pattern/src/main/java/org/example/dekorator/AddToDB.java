package org.example.dekorator;

import java.util.ArrayList;
import java.util.List;

public class AddToDB implements Service{
    OutMail outMail;
List<String> database=new ArrayList<>();
    public AddToDB(OutMail outMail) {
        this.outMail = outMail;
    }

    @Override
    public void sendMessage(String message) {
        database.add(message);
        System.out.println(outMail.getText()+" and added to DB");
    }
}
