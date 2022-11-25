package com.algo;

import java.util.Arrays;
import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3, 2, 1, 2, 3);//7, 1, 3, 4, 1, 7
        System.out.println(MinimumDistances.minimumDistances(input));
    }

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = a.size() - 1;
        boolean isFirst = false;
        while (i < j) {
            if (a.get(i) == a.get(j)) {
                result = Math.min(result, Math.abs(i - j));
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
