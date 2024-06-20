package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class Task2 {
    public static void main(String[] args) {
        sumWhile(12345);
        System.out.println("--");
        sumFor(12345);
    }

    private static void sumFor(int num) {
        int result;
        for (result = 0; num != 0; num /= 10) {
            result += num % 10;
        }
        System.out.println(result);
    }

    private static void sumWhile(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        System.out.println(result);
    }
}
