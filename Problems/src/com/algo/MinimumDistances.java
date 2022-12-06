package com.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3, 2, 1, 2, 3);//7, 1, 3, 4, 1, 7
        System.out.println(MinimumDistances.minimumDistances(input));
    }

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        int minimumDistance = Integer.MAX_VALUE;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (indexMap.containsKey(a.get(i))) {
                minimumDistance = Math.min(minimumDistance, Math.abs(i - indexMap.get(a.get(i))));
            } else {
                indexMap.put(a.get(i), i);
            }
        }
        return minimumDistance;
/*
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = a.size() - 1;
        while (i < j) {
            if (a.get(i) == a.get(j)) {
                result = Math.min(result, Math.abs(i - j));
                i++;
            } else {
                j--;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
*/
    }
}
