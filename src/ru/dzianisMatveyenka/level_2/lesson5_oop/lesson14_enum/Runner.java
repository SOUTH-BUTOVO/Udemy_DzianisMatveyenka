package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson14_enum;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(bit32);
        System.out.println(bit32.name());
        System.out.println(bit32.toString());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(bit32.BIT_32.getName());
        System.out.println(ProcessorType.BIT_64.getName());
        System.out.println(bit32.getDescription());
    }
}
