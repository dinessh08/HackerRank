package com.InterviewKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {
    public static void main(String[] args) {


        List<Integer> row1 = Arrays.asList(1, 2, 3);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(9, 8, 9);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        System.out.println(flippingMatrix(arr));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {

        int n = matrix.size() / 2;
        int m = 2 * n - 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max1 = Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(m - j)),
                        Math.max(matrix.get(m - i).get(j), matrix.get(m - i).get(m - j)));
                sum += max1;
            }
        }
        return sum;
    }
}
