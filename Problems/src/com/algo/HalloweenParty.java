package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/halloween-party/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
public class HalloweenParty {
    public static void main(String[] args) {

        List<Integer> testCases = Arrays.asList(1856378, 525494, 4137970, 952497, 3477282, 4915727, 4743036, 7987985, 6440878, 1523303);
        // Arrays.asList(5, 6, 7, 8);
        for (Integer testValue : testCases) {
            System.out.println(halloweenParty(testValue));
        }
    }

    public static long halloweenParty(int k) {
        // Write your code here
        long divisor = k / 2;
        if (k % 2 == 0) {
            return divisor * divisor;
        } else {
            return divisor * (divisor + 1);
        }
    }

}
