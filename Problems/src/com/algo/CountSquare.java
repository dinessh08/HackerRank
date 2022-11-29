package com.algo;

public class CountSquare {

    public static void main(String[] args) {

        System.out.println(squares(100, 1000));
    }

    static int squares(int a, int b) {

        int i = 1;
        int count = 0;
        while (i * i <= b) {
            if (i * i >= a) {
                count++;
            }
            i++;
        }
        //return count;

        count = 0;
        for (i = 2; i < b / 2; i++) {
            int iSquare = i * i;
            if (iSquare <= b && iSquare >= a) {
                count++;
            }
        }
        return count;
    }
}
