package ru.dzianisMatveyenka.level_2.lesson4_string.lesson2;

import java.util.Arrays;

/** Написать метод, разбивающий строку на две равные части по n символов и
 сохраняющую отдельные части в массив. Вывести эти массивы. */

public class Task5 {
    public static void main(String[] args) {
        String text = "abcdefghji";
        int n = 3;
        String[] res = split(text, n);
        System.out.println(Arrays.toString(res));
    }

    static String[] split(String text, int n) {
        int arrSize = (int) Math.ceil(text.length() / (double) n);
        String[] result = new String[arrSize];
        int count = 0;
        for (int i = 0; i < text.length(); i += n) {
            int endIndex = Math.min(text.length(), i + n);
            String substring = text.substring(i, endIndex);
            result[count] = substring;
            count++;
        }
        return result;
    }
}
