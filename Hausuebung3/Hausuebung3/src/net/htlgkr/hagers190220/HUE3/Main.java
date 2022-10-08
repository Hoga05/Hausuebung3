package net.htlgkr.hagers190220.HUE3;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        FileReader f = new FileReader("weapons.csv");
        f.readDatei();

        f.sortDamageCombatTypeDamageTypeDamage();

        f.print();
        PredicateBeispiel3 p = new PredicateBeispiel3();
        System.out.println("IsEven und Positiv:");
        System.out.println(p.isEven.and(p.isPositive).test(4));
        System.out.println("Is Positive und nicht Even:");
        System.out.println(p.isPositive.and(p.isEven.negate()).test(5));
        System.out.println("Is null:");
        System.out.println(p.isnull.test(null));
        System.out.println("Is word shorter than 4 words:");
        System.out.println(p.isShortWord.test("test"));

        QuadriereBeispiel4 q = new QuadriereBeispiel4();
        System.out.println("Quadrieren:");
        System.out.println(q.result);



    }
}
