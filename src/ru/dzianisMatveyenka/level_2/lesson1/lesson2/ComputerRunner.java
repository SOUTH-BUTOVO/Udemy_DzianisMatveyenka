package ru.dzianisMatveyenka.level_2.lesson1.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.load();
        System.out.println("------");

        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);
        System.out.println("------");

        computer.prtState();
    }
}
