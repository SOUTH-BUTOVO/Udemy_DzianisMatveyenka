package ru.dzianisMatveyenka.level_1.lesson7;

public class ArrayExample {
    public static void main(String[] args) {
        mass1();
    }

    private static void mass1() {
        int value = 10;
        int[] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
