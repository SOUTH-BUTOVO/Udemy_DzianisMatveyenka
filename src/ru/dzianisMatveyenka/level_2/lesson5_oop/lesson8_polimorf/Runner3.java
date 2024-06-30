package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson8_polimorf;

public class Runner3 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        laptop.load();

        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        mobile.load();
        System.out.println("-------");


        loadComp(laptop, mobile);

        prtInfo(new Computer[] {laptop, mobile});
    }

    static void prtInfo(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            System.out.println("prtInfo");
            System.out.println("-------");
        }
    }

    static void loadComp(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            computer.print();
        }
        System.out.println("-------");
    }
}
