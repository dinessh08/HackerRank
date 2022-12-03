package com.algo;

import java.util.Arrays;
import java.util.List;

public class InsertionSortRunningTIme {
    public static void main(String[] args) {
        System.out.println(runningTime(Arrays.asList(2, 1, 3, 1, 2)));
    }

    static int runningTime(List<Integer> A) {
        int N = A.size();
        int ans = 0;
        for (int i = 1; i < N; ++i) {
            int val = A.get(i);
            int j = i - 1;
            for (; j >= 0 && A.get(j) > val; --j) {
                A.set(j + 1, A.get(j));
                ans++;
            }
            A.set(j + 1, val);
        }
        return (ans);
    }
}