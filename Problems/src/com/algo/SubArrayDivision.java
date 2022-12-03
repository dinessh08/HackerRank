package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/the-birthday-bar/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
public class SubArrayDivision {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 2, 1, 3, 2);
        //Arrays.asList(2,2,1,3,2);
        //Arrays.asList(1, 2, 1, 3, 2);
        int sum = 3;//4;
        int subArrayLength = 2;
        System.out.println(birthday(inputList, sum, subArrayLength));
    }

    public static int birthday(List<Integer> s, int sum, int subArrayLength) {
        // Write your code here
        int noOfWays = 0;
        int[] prefSumArray = new int[s.size()];
        int prefSum = s.get(0);
        prefSumArray[0] = prefSum;
        for (int i = 1; i < s.size(); i++) {
            prefSumArray[i] = prefSumArray[i - 1] + s.get(i);
        }
        int subArraySum = prefSumArray[subArrayLength - 1];
        if (subArraySum == sum) {
            noOfWays++;
        }
        int endIndex = 0;
        for (int i = 1; endIndex < prefSumArray.length - 1; i++) {
            endIndex = i + subArrayLength - 1;
            subArraySum = prefSumArray[endIndex] - prefSumArray[i - 1];
            if (subArraySum == sum) {
                noOfWays++;
            }
        }
        return noOfWays;
    }
}
