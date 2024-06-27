package ru.dzianisMatveyenka.level_2.lesson1.lesson2;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("Я загрузился!");
    }

    void prtState() {
        System.out.println("Ram: " + ram);
        System.out.println("Ssd: " + ssd);
    }
}
