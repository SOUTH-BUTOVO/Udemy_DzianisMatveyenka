package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class CyclesFor {
    public static void main(String[] args) {
        forIncrement();
        System.out.println("\n--------------------");
        forDecrement();
    }

    private static void forIncrement() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    private static void forDecrement() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
