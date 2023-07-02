package org.example;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt())
                .filter(number -> number > 0 && number < 100)
                .limit(20)
                .collect(Collectors.toList());
        System.out.println(removeDuplicate(random));
        System.out.println(onlyEven(random));
        System.out.println(multiply(random));
        System.out.println(sorted(random));
        System.out.println(count(random));
        System.out.println(average(random));
    }

    //Удалить дубликаты
    public static List<Integer> removeDuplicate(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
    public static List<Integer> onlyEven(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> number > 6 && number < 18)
                .collect(Collectors.toList());

    }

    //Каждый элемент умножить на 2
    public static List<Integer> multiply(List<Integer> list) {
        return list.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }

    //Отсортировать и вывести на экран первых 4 элемента
    public static List<Integer> sorted(List<Integer> list) {
        return list.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
    }

    //- Вывести количество элементов в стриме
    public static long count(List<Integer> list) {
        return list.stream()
                .count();
    }

    //- Вывести среднее арифметическое всех чисел в стриме
    public static OptionalDouble average(List<Integer> list) {
        return list.stream()
                .mapToDouble(number -> number)
                .average();
    }

}
