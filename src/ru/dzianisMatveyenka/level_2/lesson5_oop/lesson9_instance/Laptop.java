package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson9_instance;

public class Laptop extends Computer {

    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static init block laptop");
    }

//    public Laptop() {
//        System.out.println("Constructor Laptop");
//    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop загрузился!");
    }

    @Override
    void print() {
        super.print();
        System.out.println("Weight " + weight);
    }

    void open() {
        System.out.println("Открыл крышку.");
    }

    public int getWeight() {
        return weight;
    }
}
