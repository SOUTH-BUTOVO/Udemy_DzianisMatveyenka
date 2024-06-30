package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson10_interface;

public class Runner4 {
    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(4), new Ram(4), 4);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        print(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
        }
    }
}
