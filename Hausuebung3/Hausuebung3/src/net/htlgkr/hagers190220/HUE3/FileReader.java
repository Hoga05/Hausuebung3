package net.htlgkr.hagers190220.HUE3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private String datei;
    private List<Weapon> weaponsList;

    public FileReader(String datei) {
        this.datei = datei;
        this.weaponsList = new ArrayList<>();
    }

    public void readDatei(String datei){

        try {
           weaponsList =  Files.lines(new File(datei).toPath())
                   .map(s -> s.split(";"))
                   .map((w) -> new Weapon(w[0],CombatType.valueOf(w[1]),DamageType.valueOf(w[2]),Double.parseDouble(w[3]),Double.parseDouble(w[4]),Double.parseDouble(w[5]),Double.parseDouble(w[6])))
                   .toList();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
