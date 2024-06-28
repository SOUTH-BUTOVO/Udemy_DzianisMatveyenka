package ru.dzianisMatveyenka.level_2.lesson3;


public class Computer {
    private Ssd ssd;
    private Ram ram;
    private static int counter = 0;


    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    void prtState() {
        System.out.println("Computer ram: " + ram.getValue());
        System.out.println("Computer ssd: " + ssd.getValue());
        System.out.println("counter: " + counter);
    }
}
