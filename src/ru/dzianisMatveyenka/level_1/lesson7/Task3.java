package ru.dzianisMatveyenka.level_1.lesson7;

public class Task3 {
    /**
     * Написать метод equals, который определяет равны ли между собой соответствующие
     * элементы 2-х двумерных массивов.
     */
    public static void main(String[] args) {
        int[][] mass1 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        int[][] mass2 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        equals(mass1, mass2);
    }

    private static void equals(int[][] mass1, int[][] mass2) {
        if (mass1.length != mass2.length) {
            System.out.println("Массивы не равны.");
            return;
        }

        for (int i = 0; i < mass1.length; i++) {
            int[] row1 = mass1[i];
            int[] row2 = mass2[i];
            if (row1.length != row2.length) {
                System.out.println("Массивы не равны.1");
                return;
            }
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    System.out.println("Массивы не равны.2");
                    return;
                }
            }
        }
        System.out.println("Массивы равны.");
    }
}
