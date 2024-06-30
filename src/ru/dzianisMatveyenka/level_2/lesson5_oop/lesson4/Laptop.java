package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson4;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    void open() {
        System.out.println("Открыл крышку.");
    }

    public int getWeight() {
        return weight;
    }
}
