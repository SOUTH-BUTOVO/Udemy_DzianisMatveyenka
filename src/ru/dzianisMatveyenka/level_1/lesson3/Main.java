package ru.dzianisMatveyenka.level_1.lesson3;

public class Main {
    public static void main(String[] args) {
        int value = 26;
        System.out.println(value);

        double value2 = 78.123;
        System.out.println(value2);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        final char charValue = 404;
        System.out.println(charValue);

        int a = 5;
        int b = 3;
        double res1 = a / (double) b;
        int res2 = a % b;

        System.out.println(res1);
        System.out.println(res2);

        int val1 = 6;
        val1 *= 2;
        val1 ++;
        val1 --;
        System.out.println(val1);

        int var2 = 10;
        boolean b1 = !(var2 >= 10);
        System.out.println(b1);
    }
}
