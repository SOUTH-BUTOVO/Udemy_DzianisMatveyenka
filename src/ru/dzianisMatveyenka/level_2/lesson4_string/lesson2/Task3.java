package ru.dzianisMatveyenka.level_2.lesson4_string.lesson2;

/** Написать метод, принимающий в качестве параметра (Фамилию, Имя, Отчество) и
 возвращающий инициалы в формате "Ф.И.О.". Учесть, что входные параметры могут быть
 в любом регистре, а результирующая строка должна быть в верхнем регистре. */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(
            format("Самойлович", "Сергей", "Эдуардович"));
    }

    static String format(String lastName, String firstName, String patronymicName) {
//        char last = lastName.toUpperCase().charAt(0);
//        char first = firstName.toUpperCase().charAt(0);
//        char patron = patronymicName.toUpperCase().charAt(0);

//        return last + "." + first + "." + patron + ".";


        char last = Character.toUpperCase(lastName.charAt(0));
        char first = Character.toUpperCase(firstName.charAt(0));
        char patron = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s.", last, first, patron);
    }
}
