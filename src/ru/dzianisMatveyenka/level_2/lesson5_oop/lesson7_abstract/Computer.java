package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson7_abstract;

public abstract class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer() {
        System.out.println("Constructor Computer");
    }

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

//    void load() {
//        System.out.println("Я загрузился!");
//    }

    {
        System.out.println("init block computer");
    }

    static  {
        System.out.println("static init block computer");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
