package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
