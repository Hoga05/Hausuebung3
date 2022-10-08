package net.htlgkr.hagers190220.HUE3;


import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

    int[] randoms;
    public Streams(){

        randoms = new int[1000];

        randoms = Arrays.stream(randoms).map(s -> (int)(Math.random()*100)).toArray();


        String[] arrStrings = new String[10];

        for (int h = 0; h < 10; h++) {
            arrStrings[h] = new Random().ints(48,122)
                    .filter(i -> (i<57 || i>65) && (i < 90 ||i >97))
                    .mapToObj(i -> (char) i)
                    .limit(9)
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        }



    }

    public double average(int[] numbers) {
        return Arrays.stream(numbers).asDoubleStream().average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {
        return Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return weapons.stream().min(Comparator.comparingInt(Weapon::getDamage)).orElse(null);
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream().max(Comparator.comparingInt(Weapon::getStrength)).orElse(null);
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter(w -> w.getDamageType() == DamageType.MISSILE).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream().sorted((w1,w2) -> w1.getName().length() > w2.getName().length() ? -1 : 1).findFirst().orElse(null);
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::getName).toList();
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::getSpeed).mapToInt(i -> i).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().mapToInt(Weapon::getValue).sum();
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().mapToInt(Weapon::hashCode).sum();
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream().distinct().toList();
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {

        weapons.forEach(w -> w.setValue((int) (w.getValue() * 1.1D)));

    }
}
