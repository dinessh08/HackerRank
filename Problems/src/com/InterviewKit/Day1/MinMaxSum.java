package com.InterviewKit.Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int minSUm = 0;
        int maxSum = 0;
        for (int i = 0, j = arr.size() - 1; i < 4 && j > 0; i++, j--) {

            minSUm = minSUm + arr.get(i);
            maxSum = maxSum + arr.get(j);
        }
        System.out.println(minSUm + "  " + maxSum);
    }
}
