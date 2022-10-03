package net.htlgkr.hagers190220.HUE3;

public class Main {

    public static void main(String[] args) {

        FileReader f = new FileReader("weapons.csv");
        f.readDatei();

        f.sortCombatTypeDamageTypeDamage();
        f.getWeaponsList().forEach(System.out::println);

    }
}
