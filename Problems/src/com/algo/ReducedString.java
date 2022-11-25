package com.algo;

import java.util.Stack;

public class ReducedString {
    public static void main(String[] args) {

        String input = "aaabccddd";//
        System.out.println(ReducedString.superReducedString(input));
    }

    public static String superReducedString(String s) {
        // Write your code here

        Stack<Pair> pairs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            if (pairs.empty()) {
                Pair pair = new Pair(s.charAt(i), 1);
                pairs.push(pair);
                continue;
            }
            Pair peek = pairs.peek();
            if (peek.character == s.charAt(i)) {
                peek.count++;
                count = peek.count;
            } else {
                Pair pair = new Pair(s.charAt(i), 1);
                pairs.push(pair);
            }
            if (count == 2) {
                pairs.pop();
            }
        }
        if (s.isEmpty() || pairs.empty()) {
            return "Empty String";
        }
        String result = "";
        for (Pair pair : pairs) {
            result = result + pair.character;
        }
        return result;
    }
}

//https://www.hackerrank.com/challenges/reduced-string/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
class Pair {
    char character;
    int count;

    Pair(char character, int count) {
        this.character = character;
        this.count = count;
    }
}