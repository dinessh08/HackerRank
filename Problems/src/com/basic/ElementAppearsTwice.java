package com.basic;

import java.util.Arrays;
import java.util.List;

public class ElementAppearsTwice {
    public static void main(String[] args) {

        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 4, 1, 2, 3)));

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int result = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            result = result ^ a.get(i);
        }
        return result;
    }
}
