package ru.dzianisMatveyenka.level_1.lesson7;

public class Task1 {
    public static void main(String[] args) {
        /** Написать программу, которая печатает массив с начало в обычном порядке, затем в
         обратном порядке. */

        String[] mass = {"a", "b", "c", "d", "e"};
        prtMass(mass);
        System.out.println("----");
        reversPrtMass(mass);
    }

    private static void prtMass(String[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + ": " + mass[i]);
        }
    }

    private static void reversPrtMass(String[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + mass[i]);
        }
    }
}
