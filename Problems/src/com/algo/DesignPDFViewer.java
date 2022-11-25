package com.algo;

import java.util.Arrays;
import java.util.List;

public class DesignPDFViewer {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        String word = "abc";
        DesignPDFViewer.designerPdfViewer(input, word);
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maxValue = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int index = word.charAt(i) - 'a';
            maxValue = Math.max(maxValue, h.get(index));
        }
        int result = maxValue * length;
        return result;
    }
}
