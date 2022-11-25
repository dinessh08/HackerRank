package com.algo;

public class HackerrankString {

    public static void main(String[] args) {

        String s = "hcakerrank";//"hereiamstackerrank";
        System.out.println(HackerrankString.hackerrankInString(s));
    }

    public static String hackerrankInString(String s) {
        // Write your code here

        int i = 0;
        int j = 0;
        String input = "hackerrank";
        while (i < input.length() && j < s.length()) {
            if (input.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == input.length()) {
            return "Yes";
        }
        return "No";
    }
}
