package ru.dzianisMatveyenka.level_2.lesson4.lesson2;

/**
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task1 {
    public static void main(String[] args) {
        String text = "asdfsdf :( asdfs :( asdfs :) sdfs :) asds :( sddsf";
        System.out.println(replace(text));
    }

    static String replace(String text) {
        return text.replace(":(", ":)");
    }
}
