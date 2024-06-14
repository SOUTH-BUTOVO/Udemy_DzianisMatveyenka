package ru.dzianisMatveyenka.level_1.lesson4;

public class Operator_switch {
    public static void main(String[] args) {

        int value1 = 3;
        char charVal = 'a';
        System.out.println(charVal);

        switch (value1) {
            case 1 -> System.out.println("value = 1");
            case 2 -> System.out.println("value = 2");
            case 3 -> {
                charVal = 'b';
                System.out.println("value = 3 " + charVal);
                start();
            }
            case 4 -> System.out.println("value = 4");
            default -> System.out.println("value = non");
        }

        switch (value1) {
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                break;
            case 3:
                charVal = 'c';
                System.out.println("value = 3 " + charVal);
                start();
                break;
            case 4:
                System.out.println("value = 4");
                break;
            default:
                System.out.println("value = non");
                break;
        }
    }

    static void start() {
        System.out.println("START");
    }
}
