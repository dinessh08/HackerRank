package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/larrys-array/problem
public class LarrysArray {
    public static void main(String[] args) {

        //
        List<Integer> input = Arrays.asList(1, 6, 5, 2, 4, 3);
        System.out.println(larrysArray(input));
    }

    static String larrysArray(List<Integer> A) {

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == i + 1) {
                continue;
            }

        }
        return "No";
    }
}
