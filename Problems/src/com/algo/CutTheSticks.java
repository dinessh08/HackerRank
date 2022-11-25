package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(5, 4, 4, 2, 2, 8);
        System.out.println(CutTheSticks.cutTheSticks(arr));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        result.add(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 1) {
                continue;
            }
            int smallValue = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                int updatedValue = arr.get(j) - smallValue;
                arr.set(j, updatedValue);
            }
            int newValue = 0;
            for (Integer value : arr) {
                if (value > 0) {
                    newValue++;
                }
            }
            if (newValue > 0) {
                result.add(newValue);
            }
        }
        return result;
    }
}
