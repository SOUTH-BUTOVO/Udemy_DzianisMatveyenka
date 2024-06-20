package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class Task1 {
    public static void main(String[] args) {
        factorial(9);
    }

    private static void factorial(int value) {
        int res = 1;
        for (int i = 1; i < value; i++) {
            System.out.println("i-" + i + " " + res + " * " + i + " = " + (res * i));
            res *= i;
        }
    }
}
