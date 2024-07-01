package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson14_enum;

public enum ProcessorType implements Describable {
    BIT_32("bit-32"),
    BIT_64("bit-64") {
        @Override
        public String getDescription() {
            return "bit 64 description";
        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }

    public String getName() {
        return name;
    }

}
