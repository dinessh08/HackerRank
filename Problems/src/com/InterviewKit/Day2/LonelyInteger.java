package com.InterviewKit.Day2;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-two
public class LonelyInteger {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
        System.out.println(lonelyinteger(input));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        int result = a.get(0);
        for (int i = 1; i < a.size(); i++) {

            result = a.get(i) ^ result;
        }
        return result;
    }

}
