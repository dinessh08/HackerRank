package com.strings;

//https://www.hackerrank.com/challenges/pangrams/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
public class Pangrams {
    public static void main(String[] args) {

        // We promptly judged antique ivory buckles for the prize
        // We promptly judged antique ivory buckles for the next prize
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    public static String pangrams(String s) {
        // Write your code here

        int freqCharArray[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = 0;
            char charValue = s.charAt(i);
            if (charValue > 96 && charValue < 123) {
                index = charValue - 'a';
            } else if (charValue > 64 && charValue < 91) {
                index = charValue - 'A';
            } else {
                continue;
            }
            freqCharArray[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqCharArray[i] < 1) {
                return "not pangram";
            }
        }
        return "pangram";
    }
}
