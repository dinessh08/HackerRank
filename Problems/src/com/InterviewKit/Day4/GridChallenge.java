package com.InterviewKit.Day4;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-grid-challenge/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-four
public class GridChallenge {

    public static void main(String[] args) {

        List<String> grid =
                //Arrays.asList("abc", "hjk", "mpq", "rtv");
                Arrays.asList("mpxz", "abcd", "wlmf");
        //Arrays.asList("abc","lmp","qrt");
        //Arrays.asList("uxf", "vof", "hmp");
        //Arrays.asList("kc", "iu");
        //Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        //Arrays.asList("abc", "ade", "efg");
        System.out.println(gridChallenge(grid));
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String result = "YES";
        if (grid.size() == 1) {
            return "YES";
        }//If only 1 char in array

        for (int i = 0; i < grid.size(); i++) {
            char[] gridArray = grid.get(i).toCharArray();
            Arrays.sort(gridArray);
            String resultString = "";
            for (int j = 0; j < gridArray.length; j++) {
                resultString = resultString + gridArray[j];
            }
            grid.set(i, resultString);
        }
        for (int column = 0; column < grid.size() - 1; column++) {
            for (int row = 0; row < grid.get(0).length() - 1; row++) {
                if (grid.get(row).charAt(column) > grid.get(row + 1).charAt(column)) {
                    return "NO";
                }
            }
        }
        return "YES";
/*
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size() - 1; j++) {
                char prevVal = grid.get(j).charAt(i);
                char cuurentVal = grid.get(j + 1).charAt(i);
                if (prevVal > cuurentVal) {
                    return "NO";
                }
            }
        }
        return result;
*/
    }
}