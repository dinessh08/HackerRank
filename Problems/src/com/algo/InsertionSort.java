package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/insertionsort1/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
public class InsertionSort {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
        // Arrays.asList(2, 4, 6, 8, 3);
        // Arrays.asList(1, 2, 4, 5, 3);
        insertionSort1(10, inputList);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int lastElement = arr.get(n - 1);
        int j = n - 2;
        arr.set(n - 1, arr.get(j));
        printValues(arr);
        int index = j;
        while (index > 0) {
            for (int i = 0; i <= index; i++, j--) {
                if (arr.get(i) > arr.get(i + 1)) {
                    index = i;
                }
            }
            arr.set(index, arr.get(index - 1));
            index--;
            if (lastElement > arr.get(index)) {
                arr.set(index + 1, lastElement);
                printValues(arr);
                return;
            }
            printValues(arr);
        }
        if (lastElement > arr.get(index)) {
            arr.set(index + 1, lastElement);
        } else {
            arr.set(index, lastElement);
        }
        printValues(arr);
    }

    static void printValues(List<Integer> arr) {
        for (Integer value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
