package org.example.config;

import org.example.Horse;
import org.example.HorseRacingService;
import org.example.Pair;
import org.example.Rider;
import org.springframework.context.annotation.*;

import java.util.Random;

@Configuration
@ComponentScan(basePackageClasses = Horse.class)
@EnableAspectJAutoProxy
public class AppConfiguration {
    @Bean
    public HorseRacingService horseRacingService() {
        return new HorseRacingService();
    }

    @Bean
    @Scope(value = "prototype")
    public Rider getRider(String name, Integer age) {
        return new Rider(name, age);
    }

    @Bean
    @Scope(value = "prototype")
    public Pair getPair(Integer number, Horse horse, Rider rider) {
        return new Pair(number, horse, rider);
    }

}

