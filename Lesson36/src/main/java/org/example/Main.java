package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("org.example");
        Horse horse = new Horse("Star", 5);
        Rider rider = new Rider("Ted", 41);
        Pair pair = new Pair(1, horse, rider);
        Horse horse1 = new Horse("Jango", 3);
        Rider rider1 = new Rider("Bob", 30);
        Pair pair1 = new Pair(2, horse1, rider1);
        Horse horse2 = new Horse("Still", 6);
        Rider rider2 = new Rider("Steve", 24);
        Pair pair2 = new Pair(3, horse2, rider2);
        Pair.couple.add(pair);
        Pair.couple.add(pair1);
        Pair.couple.add(pair2);

        HorseRacingService bean = applicationContext.getBean(HorseRacingService.class);
        bean.makeBet();
        bean.racing(bean.getSum(), bean.getNumberOfPair());



    }
}
