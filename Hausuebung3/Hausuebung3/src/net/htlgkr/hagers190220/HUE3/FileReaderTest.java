package net.htlgkr.hagers190220.HUE3;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @org.junit.jupiter.api.Test
    void readDatei() {

        FileReader f = new FileReader("weapons.csv");
        f.readDatei();
        assertTrue(f.getWeaponsList().get(0).name.equals("Varscona"));
    }

    @org.junit.jupiter.api.Test
    void sort(){

        FileReader f = new FileReader("weapons.csv");
        f.readDatei();
        f.sortDamage();
        assertTrue(f.getWeaponsList().get(0).name.equals("Carsomyr"));

    }

    @org.junit.jupiter.api.Test
    void sort2(){
        FileReader f = new FileReader("weapons.csv");
        f.readDatei();
        f.sortCombatTypeDamageTypeDamage();

        assertTrue(f.getWeaponsList().get(0).name.equals("Kundane"));
    }
}