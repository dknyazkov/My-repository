package org.example;

import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceLoader;

public class Processor {
    public void process(){
        ServiceLoader<Giver> load = ServiceLoader.load(Giver.class);
        Iterator<Giver> iterator = load.iterator();
        while (iterator.hasNext())
        {
            Giver next = iterator.next();
            next.giveGift();


        }
    }

    }

