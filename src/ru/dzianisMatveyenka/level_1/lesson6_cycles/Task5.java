package ru.dzianisMatveyenka.level_1.lesson6_cycles;

public class Task5 {
    public static void main(String[] args) {
        char[] letters =
        {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        printLetters1(letters);
        System.out.println("-----");
        printLetters2();
    }

    static void printLetters1(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'b' && letters[i] < 'e') {
                System.out.println((i + 1) + " - " + letters[i]);
            }
        }
    }

    static void printLetters2() {
        int num = 2;
        for (char i = 'b'; !isVowel(i); i++) {
            System.out.println(num + " - " + i);
            num++;
        }
    }

    static boolean isVowel(char value) {
        return value == 'e';
    }
}
