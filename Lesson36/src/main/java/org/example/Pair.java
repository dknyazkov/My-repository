package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class Pair implements Comparable<Pair> {
    Horse horse;
    Rider rider;
    private Integer speed;
    private Integer number;
    static List<Pair> couple = new ArrayList<>();

    public Pair(Integer number, Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
        speed = new Random().nextInt(10);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Pair{" +
                horse +
                rider +
                ", speed=" + speed +
                ", number=" + number +
                '}' + "\n ";
    }

    @Override
    public int compareTo(Pair o) {
        return o.getSpeed() - this.getSpeed();
    }
}
