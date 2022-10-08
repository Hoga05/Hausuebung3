package net.htlgkr.hagers190220.HUE3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateBeispiel3 {

    final Predicate<Integer> isEven = integer -> integer % 2 == 0;
    final Predicate<Integer> isPositive = integer -> integer >= 0;
    final Predicate<Integer> isNull = integer -> integer == 0;
    final Predicate<Integer> isnull = integer -> integer == null;
    final Predicate<String> isShortWord = s -> s.length()<=4;

}
