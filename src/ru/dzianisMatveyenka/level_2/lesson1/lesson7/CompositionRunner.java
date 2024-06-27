package ru.dzianisMatveyenka.level_2.lesson1.lesson7;

public class CompositionRunner {
    public static void main(String[] args) {
        Ssd ssd = new Ssd(10000);
        Ram ram = new Ram(1024);
        Computer computer = new Computer(ssd, ram);
        computer.prtState();
    }
}
