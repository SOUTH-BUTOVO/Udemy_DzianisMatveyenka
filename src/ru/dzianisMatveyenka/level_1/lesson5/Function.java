package ru.dzianisMatveyenka.level_1.lesson5;

public class Function {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(getMax(a, b));
    }

    static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
