package ru.dzianisMatveyenka.level_2.lesson1_3;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer2 = new Computer(2048);
        Computer computer3 = new Computer(1024, 512);

        computer.load();
        System.out.println("------");

        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);
        System.out.println("------");

        computer.prtState();
        System.out.println("------");

        computer2.prtState();
        System.out.println("------");

        computer3.prtState();
    }
}
