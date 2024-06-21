package ru.dzianisMatveyenka.level_1.lesson7;

import java.util.Arrays;

public class MulArrEx {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 0};
        int[][] mass = {arr1, arr2};

        int[][] val = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 0}
        };
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(Arrays.toString(val[i]) + " ");
            }
            System.out.println();
        }
    }
}
