package net.htlgkr.hagers190220.HUE3;

import java.util.ArrayList;
import java.util.List;

public class Weapon{

    String name;
    CombatType combtType;
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

    public CombatType getCombtType() {
        return combtType;
    }

    public void setCombtType(CombatType combtType) {
        this.combtType = combtType;
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
        this.combtType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " " + combtType + " " + damageType + " " + damage + " " + speed + " " + strength + " " + value;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }



    public List<String> getTeile(){

        List<String> l = new ArrayList<>();
        l.add(name);
        l.add(combtType+"");
        l.add(damageType+"");
        l.add(damage+"");
        l.add(speed+"");
        l.add(strength+"");
        l.add(value+"");
        return l;
    }
}
