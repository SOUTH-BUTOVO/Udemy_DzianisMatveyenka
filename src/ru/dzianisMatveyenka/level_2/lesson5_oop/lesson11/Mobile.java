package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson11;

public class Mobile extends Computer {


    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Smartphone load");
    }
}
