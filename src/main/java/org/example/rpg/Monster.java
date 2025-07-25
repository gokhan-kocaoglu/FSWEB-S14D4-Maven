package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double attack() {
        double bleedDamage = 0;
        double poisonDamage = 0;

        if (this instanceof Bleedable) {
            bleedDamage = ((Bleedable) this).bleed();
        }
        if (this instanceof Poisonable) {
            poisonDamage = ((Poisonable) this).poison();
        }
        return getDamage() + bleedDamage + poisonDamage;
    }
}
