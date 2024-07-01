package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson13;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин " + super.getName() + ", атакует врага мечом! " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
