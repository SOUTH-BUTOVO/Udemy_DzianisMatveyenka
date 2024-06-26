package ru.dzianisMatveyenka.level_2.lesson1_1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 199, 25};
        prtArray(values);
    }

    private static void prtArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
