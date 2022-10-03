package net.htlgkr.hagers190220.HUE3;

import java.util.Comparator;

public class Weapon {

    String name;
    CombatType combatType;
    DamageType damageType;
    double damage;
    double speed;
    double strength;
    double value;

    public Weapon(String name, CombatType combatType, DamageType damageType, double damage, double speed, double strength, double value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " " +damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
