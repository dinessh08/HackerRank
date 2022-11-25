package com.InterviewKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-two
public class CountSort {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);
        System.out.println(countingSort(arr));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int[] freqArr = new int[100];
        for (Integer value : arr) {
            freqArr[value] = freqArr[value] + 1;
        }
        for (int i = 0; i < freqArr.length; i++) {
            result.add(freqArr[i]);
        }
        return result;
    }
}
