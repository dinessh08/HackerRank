package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {

        List<Integer> width = Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3);
        //[[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]
        List<List<Integer>> cases = new ArrayList<>();

        List<Integer> zeroList = new ArrayList<>();
        zeroList.add(0);
        zeroList.add(3);
        cases.add(zeroList);
        List<Integer> oneList = new ArrayList<>();
        oneList.add(4);
        oneList.add(6);
        cases.add(oneList);
        List<Integer> twoList = new ArrayList<>();
        twoList.add(6);
        twoList.add(7);
        cases.add(twoList);
        List<Integer> threeList = new ArrayList<>();
        threeList.add(3);
        threeList.add(5);
        cases.add(threeList);
        List<Integer> fourList = new ArrayList<>();
        fourList.add(0);
        fourList.add(7);
        cases.add(fourList);
        ServiceLane.serviceLane(width, cases);
    }

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
        // Write your code here

        List<Integer> result = new ArrayList<>(cases.size());
        for (List<Integer> innerList : cases) {
            int startIndex = innerList.get(0);
            int endIndex = innerList.get(1);
            int minWidth = Integer.MAX_VALUE;
            for (int i = startIndex; i <= endIndex; i++) {
                minWidth = Math.min(minWidth, width.get(i));
            }
            result.add(minWidth);
        }
        return result;
    }
    //https://www.hackerrank.com/challenges/service-lane/problem
}
