package ru.dzianisMatveyenka.level_2.lesson1.lesson8;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalTime) {
        this.hours = totalTime / 3600;
        this.minutes = totalTime % 3600 / 60;
        this.seconds = totalTime % 3600 % 60;
    }

    int totalTime() {
        return seconds + minutes * 60 + hours * 3600;
    }

    Time sum(Time second) {
        return new Time(this.totalTime() + second.totalTime());
    }

    void prt() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }
}
