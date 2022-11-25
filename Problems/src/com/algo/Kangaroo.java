package com.algo;

public class Kangaroo {
    public static void main(String[] args) {

        System.out.println(kangaroo(0, 3, 4, 2));//kangaroo(1,2,2,1)//kangaroo(0, 2, 5, 3)
    }

    //https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=false
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if ((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2)) {
            return "NO";
        }
        int firstSum = 0;
        int secondSum = 0;
        if (x2 > x1 && v1 > v2) {
            firstSum = x1 + v1;
            secondSum = x2 + v2;
            while (firstSum < secondSum) {
                firstSum = firstSum + v1;
                secondSum = secondSum + v2;
            }
            if (firstSum == secondSum) {
                return "YES";
            }
        }
        return "NO";
    }

}
