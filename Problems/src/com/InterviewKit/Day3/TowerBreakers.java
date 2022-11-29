package com.InterviewKit.Day3;

//https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-three
public class TowerBreakers {
    public static void main(String[] args) {

        // System.out.println(towerBreakers(2, 6));
        //System.out.println(towerBreakers(2, 2));
        System.out.println(towerBreakers(1, 4));
    }

    public static int towerBreakers(int n, int m) {
        // Write your code here

        if (m == 1) {
            return 2;
        } else if (n % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
}
