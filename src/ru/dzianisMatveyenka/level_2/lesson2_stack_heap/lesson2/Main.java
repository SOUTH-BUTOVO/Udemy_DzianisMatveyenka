package ru.dzianisMatveyenka.level_2.lesson2_stack_heap.lesson2;

public class Main {
    /** Создать класс, описывающий промежуток времени. Сам промежуток времени должен
     задаваться тремя свойствами:
        - Секундами.
        - Минутами.
        - Часами.
     Создать метод для получения полного количества секунд в объекте.
     Создать два конструктора:
        - первый, принимает общее количество секунд.
        - второй, часы, минуты и секунды по отдельности.
     Создать метод для вывода данных. */
    public static void main(String[] args) {
        Time time1 = createTime();

        Time time2 = new Time(time1.totalTime());
        System.out.println(time2.totalTime());
        time2.prt();

        Time sum = time1.sum(time2);
        sum.prt();
    }

    private static Time createTime() {
        Time time1 = new Time(1, 2, 30);
        System.out.println(time1.totalTime());
        time1.prt();
        return time1;
    }
}
