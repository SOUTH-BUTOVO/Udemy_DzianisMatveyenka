package ru.dzianisMatveyenka.level_2.lesson1.lesson3;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    Computer() {
        System.out.println("Я был создан.");
    }

    public Computer(int ssd) {
        this.ssd = ssd;
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился!");
    }

    void prtState() {
        System.out.println("Ram: " + ram);
        System.out.println("Ssd: " + ssd);
    }
}
