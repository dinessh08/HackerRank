package com.basic;

import java.math.BigInteger;

public class FibonacciModified {
    public static void main(String[] args) {

        int n = 6;
        int t1 = 0;
        int t2 = 1;
        BigInteger bigt1 = BigInteger.valueOf(t1);
        BigInteger bigt2 = BigInteger.valueOf(t2);
        BigInteger answer = BigInteger.ZERO;
        while (n > 2) {
            answer = bigt1.add(bigt2.multiply(bigt2));
            bigt1 = bigt2;
            bigt2 = answer;
            n--;
        }
        System.out.println(answer.intValue());
    }
}
