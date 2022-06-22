package com.modularArthimetic;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAOfi {
    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(0);
        int n = A.size();
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) * n);
        }
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) + (A.get((A.get(i) / n)) / n));
        }
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) % n);
        }
        System.out.println(A);
    }
}
