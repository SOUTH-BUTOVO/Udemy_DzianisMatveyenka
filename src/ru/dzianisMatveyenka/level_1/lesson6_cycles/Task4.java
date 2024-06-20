package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class Task4 {
    public static void main(String[] args) {
        simple(5);
    }

    private static void simple(int num) {
//        System.out.println(num / num == 1 && num / 1 == num && num % 2 != 0 ?
//                       "Число простое" : "Число НЕ простое");

        for (int i = 1; i < num; i++) {
            if (num == 2) {
                System.out.println("Число простое");
                break;
            } else if (num % i == 0) {
                System.out.println("Число НЕ простое");
                continue;
            } else {
                System.out.println("Число простое");
                break;
            }

        }

    }
}
