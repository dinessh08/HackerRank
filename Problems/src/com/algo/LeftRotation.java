package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {

        List<Integer> inputArray = Arrays.asList(1, 2, 3, 4, 5);
        int d = 4;
        System.out.println(rotateLeft(d, inputArray));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int length = arr.size();
        List<Integer> result = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            int index = (i + d) % length;
            result.add(arr.get(index));
        }
        return result;
    }

}
