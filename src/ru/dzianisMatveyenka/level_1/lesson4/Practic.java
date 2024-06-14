package ru.dzianisMatveyenka.level_1.lesson4;

public class Practic {
    public static void main(String[] args) {
        int month = 6;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Вы ввели что то другое.");
        }

        System.out.println(month == 12 || month == 1 || month == 2 ? "Зима" :
                           month == 3 || month == 4 || month == 5 ? "Весна" :
                           month == 6 || month == 7 || month == 8 ? "Лето" :
                           month == 9 || month == 10 || month == 11 ? "Осень" :
                           "Вы ввели что то другое.");
        System.out.println("------------------------");


        long value = 9123195646543L;
        if (value % 10 == 3) {
            System.out.println("Последняя цифра числа " + value + ", является 3.");
        } else {
            System.out.println("В числе " + value + ", последняя цифра не 3.");
        }
        System.out.println("------------------------");

        int money = 111;
        if (money % 10 == 1 && money % 100 != 11) {
            System.out.println(money + " рубль.");
        } else if (money % 10 == 2 || money % 10 == 3 || money % 10 == 4
        && !(money % 100 == 12 || money % 100 == 13 || money % 100 == 14)) {
            System.out.println(money + " рубля.");
        } else {
            System.out.println(money + " рублей.");
        }
        System.out.println("------------------------");


        int year = 2024 ;
        System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ?
                year + " год високосный!" : year + " год не високосный.");
        System.out.println("------------------------");
    }
}
