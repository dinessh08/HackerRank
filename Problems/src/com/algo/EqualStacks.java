package com.algo;

public class EqualStacks {

    public static void main(String[] args) {

        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};
        System.out.println(EqualStacks.equalStacks(h1, h2, h3));
    }

    public static int equalStacks(int[] h1, int[] h2, int[] h3) {
        // Write your code here
        int sum1 = 0;
        for (int i = 0; i < h1.length; i++) {
            sum1 = sum1 + h1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < h2.length; i++) {
            sum2 = sum2 + h2[i];
        }
        int sum3 = 0;
        for (int i = 0; i < h3.length; i++) {
            sum3 = sum3 + h3[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (sum1 != sum2 || sum1 != sum3) {
            int minOfAll = Math.min(Math.min(sum1, sum2), sum3);
            if (sum1 != minOfAll) {
                sum1 = sum1 - h1[i];
                i++;
            }
            if (sum2 != minOfAll) {
                sum2 = sum2 - h2[j];
                j++;
            }
            if (sum3 != minOfAll) {
                sum3 = sum3 - h3[k];
                k++;
            }
        }
        return sum1;
    }
    //https://www.hackerrank.com/challenges/equal-stacks/problem

}

