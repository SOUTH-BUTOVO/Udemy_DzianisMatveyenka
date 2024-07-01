package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson12_practik.Task1;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + super.getName() + ", стреляет из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
