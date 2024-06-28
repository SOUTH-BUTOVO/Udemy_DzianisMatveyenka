package ru.dzianisMatveyenka.level_2.lesson4.lesson2;

/** Подсчитать количество всех точек, запятых и восклицательных знаков в строке. */

public class Task4 {
    public static void main(String[] args) {
        String text = "asdfsdf.,!asdf.,?sasdf!asdf";
        System.out.println(countSymbols(text));
    }

    static int countSymbols(String text) {
        String result = text.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return text.length() - result.length();
    }
}
