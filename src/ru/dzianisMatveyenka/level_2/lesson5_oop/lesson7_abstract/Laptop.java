package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson7_abstract;

public class Laptop extends Computer {

    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static init block laptop");
    }

    public Laptop() {
        System.out.println("Constructor Laptop");
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    void open() {
        System.out.println("Открыл крышку.");
    }

    @Override
    public void load() {
        System.out.println("Laptop загрузился!");
    }

    public int getWeight() {
        return weight;
    }
}
