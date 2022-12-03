package com.algo;

//https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class SherlockAndTheBeast {
    public static void main(String[] args) {

        decentNumber(8);
    }

    public static void decentNumber(int n) {
        // Write your code here
        if (n == 5) {
            System.out.println("33333");
        } else if (n % 3 == 0) {
            String answer = "";
            while (n > 0) {
                answer = answer + "5";
                n--;
            }
            System.out.println(answer);
        } else if (n > 7) {
            int fivesCount = 0;
            int threesCount = 0;
            String answer = "";
            while (n > 0) {
                if (n % 3 == 0) {
                    n = n - 3;
                    fivesCount++;
                } else if (n % 5 == 0) {
                    n = n - 5;
                    threesCount++;
                }
            }
            if (n != 0) {
                System.out.println("-1");
                return;
            }
            while (fivesCount > 0) {
                answer = answer + "555";
                fivesCount--;
            }
            while (threesCount > 0) {
                answer = answer + "33333";
                threesCount--;
            }
            System.out.println(answer);
        }
    }
}
