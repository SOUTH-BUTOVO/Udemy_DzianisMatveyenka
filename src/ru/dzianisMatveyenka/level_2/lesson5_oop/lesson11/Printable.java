package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson11;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(RANDOM.nextInt());
        System.out.println(generateRandom());
        print();
        System.out.println("Default realisation");
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }
}
