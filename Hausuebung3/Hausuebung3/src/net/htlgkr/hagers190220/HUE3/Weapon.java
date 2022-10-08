package net.htlgkr.hagers190220.HUE3;

import java.util.ArrayList;
import java.util.List;

public class Weapon{

    String name;
    CombatType combtType;
    DamageType damageType;
    int damage;
    int speed;
    int strength;
    int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getCombtType() {
        return combtType;
    }

    public void setCombatType(CombatType combtType) {
        this.combtType = combtType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int strength, int value) {
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
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
