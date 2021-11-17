package com.basic;

import java.util.Scanner;

public class StdInStdOut {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        //After supplying data for int, we would hit the enter key.
        // What nextInt() and nextDouble() does is, it assigns integer to appropriate variable
        // and keeps the enter key unread in the keyboard buffer.
        // so when its time to supply String the nextLine() will read the enter key from the user thinking
        // that the user has entered the enter key.(that's we get empty output)
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
