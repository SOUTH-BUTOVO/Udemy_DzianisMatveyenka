package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson6;

public class Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(2048);
        Ssd ssd = new Ssd(40000);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        System.out.println(ram.getValue());
        System.out.println(ssd.getValue());
        double sin = Math.sin(2.5);
        System.out.println(sin);
        System.out.println("--------");

        Laptop laptop = new Laptop(new Ssd(500), new Ram(512), 2);
        laptop.open();
        laptop.load();
        System.out.println("--------");
    }
}
