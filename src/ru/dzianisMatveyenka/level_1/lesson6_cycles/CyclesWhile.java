package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class CyclesWhile {
    public static void main(String[] args) {
        whileEx();
        System.out.println("\n--------------------");
        doWhileEx();
    }

    private static void doWhileEx() {
        int value = 1;
        do {
            System.out.print(value + " ");
            value ++;
        } while (value < 11);
    }

    private static void whileEx() {
        int value = 10;
        while (value > 0) {
            System.out.print(value + " ");
            value --;
        }
    }
}
