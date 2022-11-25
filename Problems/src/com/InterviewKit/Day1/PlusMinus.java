package com.InterviewKit.Day1;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {

        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float minSum = 0;
        float maxSum = 0;
        float zeroSum = 0;
        for (Integer value : arr) {
            if (value == 0) {
                zeroSum++;
            } else if (value > 0) {
                maxSum++;
            } else {
                minSum++;
            }
        }
        float size = arr.size();
        System.out.printf("%.5f", maxSum / size);
        System.out.println();
        System.out.printf("%.5f", (float) (minSum / size));
        System.out.println();
        System.out.printf("%.5f", (float) (zeroSum / size));
    }
}
