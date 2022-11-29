package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true
public class EqualizeArray {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(3, 3, 2, 1, 3);
        // Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3);
        // Arrays.asList(3, 3, 2, 1, 3);
        // Arrays.asList(1, 2, 2, 3);
        System.out.println(equalizeArray(inputList));
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here

        int maxFreq = 0;
        int[] freqArray = new int[101];
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            freqArray[arr.get(i)]++;
            maxFreq = Math.max(maxFreq, freqArray[arr.get(i)]);
        }
        return size - maxFreq;
    }
}
