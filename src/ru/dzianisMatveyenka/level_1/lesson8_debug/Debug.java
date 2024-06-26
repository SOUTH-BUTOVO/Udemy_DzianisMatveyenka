package ru.dzianisMatveyenka.level_1.lesson8_debug;

public class Debug {
    /**
     * Определить сумму элементов целочисленного массива, расположенных между минимальным
     * и максимальным значениями массива.
     */
    public static void main(String[] args) {
        int[] mass = {1, 0, 2, 5, 6, 4, 10, 3};
        int max = mass[0];
        int maxIndex = 0;
        int min = mass[0];
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }
            if (mass[i] < min) {
                min = mass[i];
                minIndex = i;
            }
            // или, или
//            if (minIndex > maxIndex) {
//            int temp = minIndex;
//            minIndex = maxIndex;
//            maxIndex = temp;
//            }
        }
        System.out.println("Максимальное число в массиве: " + max + "\n" +
                           "Индекс максимального числа: " + maxIndex + "\n" +
                           "Минимальное число в массиве: " + min + "\n" +
                           "Индекс минимального числа: "  + minIndex);

        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += mass[i];

        }
        // или, или
        if (sum == 0) {
            for (int j = maxIndex + 1; j < minIndex; j++) {
                sum += mass[j];
            }
        }
        System.out.println
                ("Сумма чисел в массиве между минимальным и максимальным числом = " + sum);
    }
}
