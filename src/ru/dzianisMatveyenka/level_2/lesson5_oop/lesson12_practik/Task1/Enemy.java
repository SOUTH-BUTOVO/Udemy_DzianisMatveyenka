package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson12_practik.Task1;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive() &&  health <= damage) {
            health = 0;
            System.out.println(getName() + " повержен.");
        } else {
            this.health -= health > damage ? damage : health;
            System.out.println(name + " получил урон " + damage + ", здоровье врага: " + health + "\n");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
