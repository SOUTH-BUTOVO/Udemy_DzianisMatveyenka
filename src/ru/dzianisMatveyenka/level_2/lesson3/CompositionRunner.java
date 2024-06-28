package ru.dzianisMatveyenka.level_2.lesson3;

public class CompositionRunner {
    public static void main(String[] args) {
        Ssd ssd = new Ssd(10000);
        Ram ram = new Ram(1024);

        Computer computer = new Computer(ssd, ram);
        Computer computer2 = new Computer(null, null);
        Computer computer3 = new Computer(null, null);

        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);

        computer.prtState();
        System.out.println("counter: " + Computer.getCounter());

        Class<? extends Computer> aClass1 = computer.getClass();
        Class<? extends Computer> aClass2 = computer.getClass();
        System.out.println(aClass1);
        System.out.println(aClass1 == aClass2);
        System.out.println(aClass1.equals(aClass2));

        System.out.println(computer2 == computer3);
        System.out.println(computer2.equals(computer3));
    }
}
