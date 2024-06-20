package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class Task3 {
    public static void main(String[] args) {
        sale(1626, 24, 5);
    }

    private static void sale(int year, int manhattan, int rate) {
        double res = 0;
        for (year += 1; year <= 2020; year++) {
            res += (double) manhattan * 5 / 100;
        }
        System.out.println(res + "$");
    }
}
