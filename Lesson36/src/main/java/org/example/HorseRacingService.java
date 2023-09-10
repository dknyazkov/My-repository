package org.example;

import lombok.Getter;
import org.example.Pair;
import org.example.User;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.Scanner;

@Getter
@Component
public class HorseRacingService {
    User user = new User();
    private Integer wallet = user.getWallet();
    private Scanner scanner = new Scanner(System.in);
    private Integer sum;
    private Integer numberOfPair;

    public void makeBet() {
        System.out.println("Введите номер пары на которую вы делаете ставку:");
        numberOfPair = scanner.nextInt();
        System.out.println("Введите сумму ставки");
        sum = scanner.nextInt();
        while (sum >= user.getWallet()) {
            System.out.println("Недостаточно средств");
            sum = scanner.nextInt();
        }
    }

    public void racing(Integer sum, Integer numberOfPair) {
        for (int i = 1; i <= 5; i++) {
            Pair.couple.sort(Pair::compareTo);
            System.out.println("После круга номер " + i + " лидирует пара номер " + Pair.couple.get(0).getNumber());
            for (Pair pairs : Pair.couple
            ) {
                pairs.setSpeed(pairs.getSpeed() + new Random().nextInt(10));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Победитель - пара номер " + Pair.couple.get(0).getNumber() + "!");
        if (Pair.couple.get(0).getNumber() == numberOfPair) {
            wallet += sum;
            System.out.println("Вы победили!");
        } else {
            wallet -= sum;
            System.out.println("Вы проиграли(");
        }
        System.out.println("Ваш текущий баланс: " + wallet);
    }

}
