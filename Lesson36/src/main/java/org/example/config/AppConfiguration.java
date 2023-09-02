package org.example.config;

import org.example.Horse;
import org.example.HorseRacingService;
import org.example.Pair;
import org.example.Rider;
import org.springframework.context.annotation.Bean;

public class AppConfiguration {
    @Bean

    public HorseRacingService horseRacingService(){
        return new HorseRacingService();
    }
    @Bean
    public Horse getHorse(){
        return new Horse();
    }
    @Bean
    public Rider getRider(){
        return new Rider();
    }
    @Bean
    public Pair getPair(){
        return new Pair();
    }
}
