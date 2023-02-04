package com.chandra;

import java.util.HashMap;
import java.util.Map;

public class MinimumRepeatedChars {

    //input = cdadcda  - c 2 times, the char which occurs first is the answer
    public static void main(String[] args) {

        String input = "gfggaasr";//""cdadcda";//
        System.out.println(minimumChar(input));
    }

    static char minimumChar(String input) {

        char answer = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            int frequency = freqMap.get(input.charAt(i)) == null ? 0 : freqMap.get(input.charAt(i)) + 1;
            freqMap.put(input.charAt(i), frequency);
        }
        int minimumFreq = Integer.MAX_VALUE;
        for (int i = 0; i < input.length(); i++) {
            if (minimumFreq > freqMap.get(input.charAt(i))) {
                minimumFreq = freqMap.get(input.charAt(i));
                answer = input.charAt(i);
            }
        }

/*        int[] smallCase = new int[26];
        int[] upperCase = new int[26];
        int[] numerals = new int[10];

        int freqSmallCase = Integer.MAX_VALUE;
        int freqUpperCase = Integer.MAX_VALUE;
        int freqNumeral = Integer.MAX_VALUE;

        int smallIndex = Integer.MAX_VALUE;
        int upperIndex = Integer.MAX_VALUE;
        int numIndex = Integer.MAX_VALUE;


        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {

            char c = inputArray[i];
            int smallCaseIndex = c - 'a';
            int upperCaseIndex = c - 'A';
            int numeralIndex = c - '0';
            if (smallCaseIndex >= 0 && smallCaseIndex < 26) {
                int freqSmall = smallCase[smallCaseIndex]++;
                if (freqSmall <= freqSmallCase) {
                    freqSmallCase = freqSmall;
                    smallIndex = smallCaseIndex;
                }
            } else if (upperCaseIndex >= 0 && upperCaseIndex < 26) {
                int freqUpper = upperCase[upperCaseIndex]++;
                if (freqUpper <= freqUpperCase) {
                    freqUpperCase = freqUpper;
                    upperIndex = upperCaseIndex;
                }
            } else if (numeralIndex >= 0 && numeralIndex < 10) {
                int freqNum = numerals[numeralIndex]++;
                if (freqNum <= freqNumeral) {
                    freqNumeral = freqNum;
                    numIndex = numeralIndex;
                }
                freqNumeral = Math.min(freqNum, freqNumeral);
            }

        }

        if (freqSmallCase < Math.min(freqUpperCase, freqNumeral)) {

        }
*/
        return answer;
    }
}
