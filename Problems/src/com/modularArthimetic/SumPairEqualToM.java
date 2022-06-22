package com.modularArthimetic;

import java.util.HashMap;
import java.util.Map;

public class SumPairEqualToM {
    public static void main(String[] args) {

        int[] A = {5, 17, 100, 11};//{1, 2, 3, 4, 5};
        System.out.println(solve(A, 28));
    }

    public static int solve(int[] A, int B) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] % B;
        }
        int result = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            freqMap.put(A[i], freqMap.get(A[i]) == null ? 1 : freqMap.get(A[i]) + 1);
        }
        result = freqMap.get(0) == null ? 0 : freqMap.get(0);
        int i = 1;
        int j = B - 1;
        while (i < j) {
            result = result + (freqMap.get(A[i]) * freqMap.get(A[j]));
            i++;
            j--;
        }
        if (B % 2 == 0) {
            result = result + freqMap.get(B / 2);
        }
        return result;
    }

}
