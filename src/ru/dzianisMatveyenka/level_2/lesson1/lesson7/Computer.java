package ru.dzianisMatveyenka.level_2.lesson1.lesson7;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void prtState() {
        System.out.println("Computer ram: " + ram.getValue());
        System.out.println("Computer ssd: " + ssd.getValue());
    }
}
