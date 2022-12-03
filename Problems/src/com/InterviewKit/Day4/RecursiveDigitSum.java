package com.InterviewKit.Day4;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-recursive-digit-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-four
public class RecursiveDigitSum {
    public static void main(String[] args) {

        System.out.println(superDigit("546630947312051453014172159647935984478824945973141333062252613718025688716704470547449723886626736", 100000));//("123", 3));//("9875", 4));
    }

    static int superDigit(String n, int k) {

        long nTotal = 0;
        for (int i = 0; i < n.length(); i++) {
            int inputVal = Integer.parseInt(n.charAt(i) + "");
            nTotal = nTotal + inputVal;
        }
/*
        long nValue = Long.parseLong(n);
        while (nValue > 9) {
            nTotal = nTotal + (nValue % 10);
            nValue = nValue / 10;
        }
        nValue = nValue + nTotal;
        nValue = nValue * k;
*/
        nTotal = nTotal * k;
        return (int) sum(nTotal);
    }

    static long sum(long input) {
        if (input > 0 && input < 10) {
            return input;
        }
        long sum = 0;
        while (input > 9) {
            sum = sum + input % 10;
            input = input / 10;
        }
        sum = sum + input;
        return sum(sum);
    }
/*
    public static int superDigit(String n, int k) {
        // Write your code here
        String concatString = n;
        int sum = 0;
        while (k > 1) {
            n = n + concatString;
            k--;
        }
        long inputValue = Long.parseLong(n);
        return (int) sum(inputValue);
    }

    static long sum(long input) {
        if (input > 0 && input < 10) {
            return input;
        }
        long sum = 0;
        while (input > 9) {
            sum = sum + input % 10;
            input = input / 10;
        }
        sum = sum + input;
        return sum(sum);
    }*/
}
