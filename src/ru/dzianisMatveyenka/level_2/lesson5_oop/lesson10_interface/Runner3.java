package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson10_interface;

public class Runner3 {
    public static void main(String[] args) {

        double value = 2.5;
        int intValue = (int) value;

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        laptop.load();

        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        mobile.load();
        System.out.println("-------");

        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10_000), 5);
        System.out.println("-------");


        loadComp(laptop, mobile);

        prtInfo(new Computer[] {laptop, mobile, laptop1});
    }

    static void prtInfo(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop) {
                ((Laptop) computer).open();
            }
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
