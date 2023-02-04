package com.InterviewKit.Day5;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Scanner in = new Scanner(System.in);
        String queries = in.nextLine();
        int numOfQueries = Integer.parseInt(queries);
        while (numOfQueries > 0) {
            queries = in.nextLine();
            queueOperation(queries, stack1, stack2);
            numOfQueries--;
        }
        in.close();
    }

    static void queueOperation(String operation, Stack<Integer> stack1, Stack<Integer> stack2) {

        if (operation.startsWith("1")) {
            String element = operation.split(" ")[1];
            stack1.push(Integer.parseInt(element));
        } else if (operation.startsWith("2")) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        } else if (operation.startsWith("3")) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack2.peek());
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }
}
