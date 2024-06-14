package ru.dzianisMatveyenka.level_1.lesson4;

public class Operator_if_else {
    public static void main(String[] args) {
        int value = 10;
        boolean b = value > 0;
        if (value > 0) {
            System.out.println("Число является положительным!");
        } else if (value < 0){
            System.out.println("Число является отрицательным.");
        } else {
            System.out.println("Число равно нулю.");
        }
    }
}