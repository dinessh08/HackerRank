package com.algo;

import java.util.HashSet;
import java.util.Set;

//https://www.hackerrank.com/challenges/find-digits/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class FindDigits {
    public static void main(String[] args) {

        System.out.println(findDigits(12));
        //12
        //1012
    }

    public static int findDigits(int n) {
        // Write your code here
        int divisorCount = 0;
        int divider = n;
        int divisor = n % 10;
        Set<Integer> divisorSets = new HashSet<>();
        divisorSets.add(0);
        while (divider > 9) {
            if (divisor != 0 && n % divisor == 0) {
                divisorCount++;
                divisorSets.add(divisor);
            }
            divider = divider / 10;
            divisor = divider % 10;
        }
        if (divisor != 0 && n % divisor == 0) {
            divisorCount++;
        }
        return divisorCount;
    }
}
