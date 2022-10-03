package net.htlgkr.hagers190220.HUE3;

import org.junit.Test;

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
        f.sort();
        assertTrue(f.getWeaponsList().get(0).name.equals("Carsomyr"));

    }
}