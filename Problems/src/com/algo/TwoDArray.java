package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/2d-array/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class TwoDArray {
    public static void main(String[] args) {

        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(0, -4, -6, 0, -7, -6));
        input.add(Arrays.asList(-1, -2, -6, -8, -3, -1));
        input.add(Arrays.asList(-8, -4, -2, -8, -8, -6));
        input.add(Arrays.asList(-3, -1, -2, -5, -7, -4));
        input.add(Arrays.asList(-3, -5, -3, -6, -6, -6));
        input.add(Arrays.asList(-3, -6, 0, -8, -6, -7));
        System.out.println(hourglassSum(input));
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i + 2 < arr.size(); i++) {
            for (int j = 0; j + 2 < arr.size(); j++) {
                int row1Sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int midRow = arr.get(i + 1).get(j + 1);
                int row2Sum = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int sum = row1Sum + midRow + row2Sum;
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
