package com.algo;

public class CorrectnessInvariantLoop {

    public static void main(String[] args) {

        int A[] = {7, 4, 3, 5, 6, 2};
        CorrectnessInvariantLoop.insertionSort(A);
    }

    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }
    // https://www.hackerrank.com/challenges/correctness-invariant/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=60-day-campaign
}