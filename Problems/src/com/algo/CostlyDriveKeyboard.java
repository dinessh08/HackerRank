package com.algo;

import java.util.Arrays;

public class CostlyDriveKeyboard {
    public static void main(String[] args) {

        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int b = 10;
        System.out.println(CostlyDriveKeyboard.getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int result = 0;
        int i = 0;
        int j = 0;
        int total = 0;
        int answer = 0;
        while (i < keyboards.length && j < drives.length) {
            int keyboardPrice = keyboards[i];
            int drivePrice = drives[j];
            total = keyboardPrice + drivePrice;
            if (total > answer && total <= b) {
                answer = total;
            }
            if (keyboardPrice > b) {

            }
            if (drivePrice > b) {

            }
            i++;
            j++;
        }
        return result;
    }
}
