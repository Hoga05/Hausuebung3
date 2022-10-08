package net.htlgkr.hagers190220.HUE3;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class QuadriereBeispiel4 {
    final int result = IntStream.of(1,2,3,4,5,6,7,8,9,10)
            .filter(i -> i % 2 == 1)
            .map(i -> i*i)
            .reduce(0, Integer::sum);
}
