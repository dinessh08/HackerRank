package com.InterviewKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-two
public class DiagonalDifference {
    public static void main(String[] args) {

        List<Integer> row1 = Arrays.asList(1, 2, 3);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(9, 8, 9);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int result = 0;
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(arr.size() - i - 1);
        }
        result = Math.abs(d1 - d2);
        return result;
    }

}
