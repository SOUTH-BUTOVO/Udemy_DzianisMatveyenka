package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson9_instance;

public class Runner2 {
    public static void main(String[] args) {
        new Laptop(new Ssd(2), new Ram(2), 2);
    }
}
