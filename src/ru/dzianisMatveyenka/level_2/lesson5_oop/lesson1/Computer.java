package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson1;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился!");
    }
}
