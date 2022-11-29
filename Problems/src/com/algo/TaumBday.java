package com.algo;

//https://www.hackerrank.com/challenges/taum-and-bday/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
public class TaumBday {
    public static void main(String[] args) {

        //3 3     b = 3, w = 3
        //1 9 2   bc = 1, wc = 9, z = 2

        System.out.println(taumBday(10, 10, 1, 1, 1));
        System.out.println(taumBday(5, 9, 2, 3, 4));
        System.out.println(taumBday(3, 6, 9, 1, 1));
        System.out.println(taumBday(7, 7, 4, 2, 1));
        System.out.println(taumBday(3, 3, 1, 9, 2));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long total = b + w;

        long b1 = b;
        long w1 = w;
        long bc1 = bc;
        long wc1 = wc;
        long z1 = z;
        if (bc1 == wc1) {
            return total * bc1;
        } else if (wc1 > bc1 + z1) {
            return (b1 * bc1 + w1 * bc1 + w1 * z1);
        } else if (bc1 > wc1 + z1) {
            return (w1 * wc1 + b1 * wc1 + b1 * z1);
        } else {
            return (b1 * bc1 + w1 * wc1);
        }
    }

}
