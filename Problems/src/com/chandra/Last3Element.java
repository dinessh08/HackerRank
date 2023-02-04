package com.chandra;

import java.util.Scanner;

public class Last3Element {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int startIndex = length - 3;
        String output = "";
        int inputCount = 0;
        while (inputCount < length) {
            if (inputCount < startIndex) {
                scan.nextInt();
            } else {
                output = output + scan.nextInt();
            }
            inputCount++;
        }
        scan.close();
        System.out.println(output);
    }
}
