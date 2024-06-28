package ru.dzianisMatveyenka.level_2.lesson4.lesson2;

/** Написать метод, принимающий 2 параметра (строку и слово) и возвращающий true, если
 строка начинается и заканчивается этим словом. */

public class Task2 {
    public static void main(String[] args) {
        String text = "1233 privet, я изучаю java 1123";
        String word = "123";
        System.out.println(isStartAndEnd(text, word) ?
                "Есть совпадения" : "Нет совпадений");
    }

    static boolean isStartAndEnd(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }
}
