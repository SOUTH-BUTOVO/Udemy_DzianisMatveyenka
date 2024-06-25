package ru.dzianisMatveyenka.level_1.lesson7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /** Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13
         или на 17, и печатающую его */
        int[] mass = new int[100];
        prtMass(mass);
    }

    private static void prtMass(int[] mass) {
        int currentIndex = 0;
        for (int i = 1; currentIndex < mass.length ; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                mass[currentIndex] = i;
                currentIndex++;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
