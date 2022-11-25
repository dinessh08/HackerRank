package com.InterviewKit.Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTest {
    public static void main(String[] args) {

        System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));//Arrays.asList(5, 3, 1, 2, 4)
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}
