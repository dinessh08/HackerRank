package com.InterviewKit.Day4;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-four
public class NewYearChaos {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(2, 1, 5, 3, 4);
        minimumBribes(input);
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int totalBribes = 0;
        for (int i = 0; i < q.size() - 1; i++) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = q.get(i) - 2; j > 0 && j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    totalBribes++;
                }
            }
        }

        System.out.println(totalBribes);
    }
}
