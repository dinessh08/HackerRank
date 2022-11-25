package com.algo;

import java.util.Arrays;
import java.util.List;

public class LisaWorkbook {

    public static void main(String[] args) {

        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));//3 8 15 11 14 1 9 2 24 31
//5
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int pageIndex = 0;
        int specialQns = 0;
        for (Integer value : arr) {
            int probStartIndex = 1;
            int probEndIndex = k;
            while (value - k >= 0) {
                value = value - k;
                pageIndex++;
                if (pageIndex >= probStartIndex && pageIndex <= probEndIndex) {
                    specialQns++;
                }
                probStartIndex = probStartIndex + k;
                probEndIndex = value > k ? probEndIndex + k : probEndIndex + value;
            }
            if (pageIndex >= probStartIndex && pageIndex <= probEndIndex) {
                specialQns++;
            }
            if (value - k > -k) {
                pageIndex++;
            }
        }
        System.out.println(specialQns);
        return 0;
    }
}
//https://www.hackerrank.com/challenges/lisa-workbook/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign