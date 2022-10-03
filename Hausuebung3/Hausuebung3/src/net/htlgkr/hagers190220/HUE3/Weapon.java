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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

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
