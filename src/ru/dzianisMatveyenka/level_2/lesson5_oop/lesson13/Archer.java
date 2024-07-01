package ru.dzianisMatveyenka.level_2.lesson5_oop.lesson13;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + super.getName() + ", стреляет из лука в " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон!");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}

class Cat {
    public static void main(String[] args) {

    }

    private class WildCat {

    }
}
