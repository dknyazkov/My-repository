package org.example.Notify;

import java.util.Observable;
import java.util.Observer;

public class CallService implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg+"has broken.Technical inspection necessary");
    }
}
