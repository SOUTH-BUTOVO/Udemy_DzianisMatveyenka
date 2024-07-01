package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson13;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + super.getName() + ", сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
