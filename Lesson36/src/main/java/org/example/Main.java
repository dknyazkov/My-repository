package org.example;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(org.example.config.AppConfiguration.class);
        HorseRacingService bean = applicationContext.getBean(HorseRacingService.class);

        //для примера использую AnnotationConfig для Horse
        Horse horse = applicationContext.getBean(Horse.class);
        Horse horse1 = applicationContext.getBean(Horse.class);
        Horse horse2 = applicationContext.getBean(Horse.class);
        horse1.setAge(3);
        horse2.setAge(3);
        horse.setAge(3);
        horse.setName("1");
        horse1.setName("2");
        horse2.setName("3");

        Rider rider = applicationContext.getBean(Rider.class, "Ted", 41);
        Rider rider1 = applicationContext.getBean(Rider.class, "Bob", 25);
        Rider rider2 = applicationContext.getBean(Rider.class, "Steve", 34);
        Pair pair = applicationContext.getBean(Pair.class, 1, horse, rider);
        Pair pair1 = applicationContext.getBean(Pair.class, 2, horse1, rider1);
        Pair pair2 = applicationContext.getBean(Pair.class, 3, horse2, rider2);
        Pair.couple.add(pair);
        Pair.couple.add(pair1);
        Pair.couple.add(pair2);
        bean.makeBet();
        bean.racing(bean.getSum(), bean.getNumberOfPair());
    }
}
