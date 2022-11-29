package com.InterviewKit.Day3;

import java.util.Arrays;

public class ZigZagSequence {
    public static void main(String[] args) {

        int n = 5;
        int[] input = {2, 3, 5, 1, 4};
        findZigZagSequence(input, n);
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n + 1) / 2;
        int temp = a[mid - 1];
        a[mid - 1] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 1;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
