package com.algo;

public class SaveThePrisoner {
    public static void main(String[] args) {

        System.out.println(SaveThePrisoner.saveThePrisoner(5, 2, 2));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here

        int p = (m % n + ((s - 1) % n)) % n;
        if (p == 0)
            p = n;
        return p;
    }
}
