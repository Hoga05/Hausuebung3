package net.htlgkr.hagers190220.HUE3;

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
}
