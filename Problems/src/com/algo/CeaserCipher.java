package com.algo;

public class CeaserCipher {
    public static void main(String[] args) {

        String input = "www.abc.xy";//abcdefghijklmnopqrstuvwxyz";//"Always-Look-on-the-Bright-Side-of-Life";//"middle-Outz";
        int k = 87;//5;//2;
        System.out.println(CeaserCipher.caesarCipher(input, k));
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            boolean isSmallCase = value > 64 && value < 91;
            boolean isUpperCase = value > 96 && value < 123;
            if (isSmallCase || isUpperCase) {
                int newValue = (value + k);
                while (isSmallCase && newValue > 90) {
                    newValue = newValue - 26;
                }
                while (isUpperCase && newValue > 122) {
                    newValue = newValue - 26;
                }
                value = (char) newValue;
            }
            result = result + value;
        }
        return result;
    }

    //https://www.hackerrank.com/challenges/caesar-cipher-1/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
}
