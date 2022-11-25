package com.algo;

public class CamelCase {

    public static void main(String[] args) {

        System.out.println(CamelCase.camelcase("saveChangesInTheEditor"));
    }

    public static int camelcase(String s) {
        // Write your code here
        int result = 0;
        if (s.charAt(0) < 97 && s.charAt(0) > 122) {
            return result;
        }
        result++;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                result++;
            }
        }
        return result;
    }
}
