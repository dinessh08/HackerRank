package com.InterviewKit.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-four
public class NewYearChaos {
    public static void main(String[] args) {

        List<Integer> input =
                //Arrays.asList(2, 5, 1, 3, 4);
                //Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8);
                Arrays.asList(2, 1, 5, 3, 4);
        minimumBribes(input);
    }

    public static void minimumBribes(List<Integer> input) {

        int totalBribes = 0;
        List<Integer> inputNew = new ArrayList<>();
        inputNew.add(0);
        inputNew.addAll(input);
        boolean isTooChaotic = false;
        for (int i = 1; i < inputNew.size(); i++) {

            Integer element = inputNew.get(i);
            if (element == i) {
                continue;
            } else if (element - 1 == i) {
                totalBribes++;
            } else if (element - 2 == i) {
                totalBribes = totalBribes + 2;
                if (isTooChaotic) {
                    System.out.println("Too Chaotic");
                    return;
                }
                isTooChaotic = true;
            } else if (element - 2 > i) {
                System.out.println("Too Chaotic");
                return;
            } else {
                if (inputNew.get(i - 1) > element) {
                    continue;
                }
            }
        }
        System.out.println(totalBribes);
    }
/*
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        var totalBribe = 0;

        for (int index = 0; index < q.size(); index++) {
            var bribe = 0;
            for (int i = 0; i < q.size(); i++) {
                if (i > index && q.get(index) > q.get(i)) {
                    bribe++;
                }
            }
            if (bribe > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                totalBribe += bribe;
            }
        }

        System.out.println(totalBribe);
    }
*/
}
