package net.htlgkr.hagers190220.HUE3;

public class Main {

    public static void main(String[] args) {

        FileReader f = new FileReader("weapons.csv");
        f.readDatei();
        f.weaponsList.forEach(System.out::println);

    }
}
