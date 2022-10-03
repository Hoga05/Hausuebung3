package net.htlgkr.hagers190220.HUE3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileReader{

    private String datei;
    private List<Weapon> weaponsList;

    public List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    public FileReader(String datei) {
        this.datei = datei;
        this.weaponsList = new ArrayList<>();
    }

    public void readDatei() {

        try {
            weaponsList = Files.lines(new File(datei).toPath())
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map((w) -> new Weapon(w[0], CombatType.valueOf(w[1]), DamageType.valueOf(w[2]), Double.parseDouble(w[3]), Double.parseDouble(w[4]), Double.parseDouble(w[5]), Double.parseDouble(w[6])))
                    .toList();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sortDamage() {


        weaponsList = weaponsList.stream().sorted(Comparator.comparingDouble(Weapon::getDamage).reversed()).toList();


    }

    public void sortDamageCombatTypeDamageTypeDamage(){

        weaponsList = weaponsList.stream()

                        .sorted(Comparator.comparing(Weapon::getDamage).reversed()
                                .thenComparing(Weapon::getCombtType)
                        .thenComparing(Weapon::getDamageType)
                        .thenComparing(Weapon::getName))
                        .toList();

    }

    public void print(){

//        Printable p = s ->{
//            s.forEach(System.out::println);
//        };
//        p.print(weaponsList);


        Printable p2 = s -> {
            s.forEach(d -> {
                d.getTeile().forEach(f -> {
                    if(f.length() < 20) {
                        System.out.print(f);
                        for (int i = f.length(); i < 20; i++) {
                            System.out.print(" ");
                        }
                        System.out.print("|");

                    }
                });
                System.out.print("\n");
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 20; j++) {
                        System.out.print("-");
                    }
                    if(i != 6) {
                        System.out.print("+");
                    }
                }
                System.out.print("|");
                System.out.println();
            });

        };
        p2.print(weaponsList);
    }

}


