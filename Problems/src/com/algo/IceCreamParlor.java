package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {

        int m = 3;//8;//9;//4;
        List<Integer> input = Arrays.asList(1, 2/*1,3,4,4,6,8*//*1,3,4,6,7,9*//*2,2,4,3*//*1, 4, 5, 3, 2*/);
        System.out.println(icecreamParlor(m, input));
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
            }
        }
        return result;
    }

}
