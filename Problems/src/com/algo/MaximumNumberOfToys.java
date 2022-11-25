package com.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfToys {
    public static void main(String[] args) {

        List<Integer> prices = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);//1, 2, 3, 4
        int k = 50;//7;
        System.out.println(MaximumNumberOfToys.maximumToys(prices, k));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        int noOfToys = 0;
        Collections.sort(prices);
        int totalPrice = 0;
        for (Integer price : prices
        ) {
            if (totalPrice + price > k) {
                break;
            }
            totalPrice = totalPrice + price;
            noOfToys++;
        }
        return noOfToys;
    }
}
