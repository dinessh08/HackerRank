package com.algo;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/the-grid-search/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
public class GridSearch {
    public static void main(String[] args) {

        List<String> G = Arrays.asList("400453592126560", "114213133098692", "474386082879648", "522356951189169", "887109450487496", "252802633388782", "502771484966748", "075975207693780", "511799789562806", "404007454272504", "549043809916080", "962410809534811", "445893523733475", "768705303214174", "650629270887160");
        //Arrays.asList("7283455864", "6731158619", "8988242643", "3830589324", "2229505813", "5633845374", "6473530293", "7053106601", "0834282956", "4607924137");
        List<String> P = Arrays.asList("99", "99");
        //Arrays.asList("9505", "3845", "3530");
        System.out.println(gridSearch(G, P));
    }

    /*
        void check(int R, int r, int C, int c,, ){

            boolean found = false;
            for (int i = 0; !found && i < R-r + 1; i++) { //iterates over "top rows" for the subgrid.
                for (int j = 0; !found && j < C-c + 1; j++) { //iterates over "left-cols" for the subgrid.
                    // System.err.println("Now checking "+ grid[i].substring(j, j+c));
                    if (subgrid[0].equals(grid[i].substring(j, j+c))) { //We've found a first row!  so, let's check all the rows below
                        System.err.println("We found a substring at row=" + i + ", col=" + j);
                        found = true;
                        for (int k = i+1; found && k < r + i; k++) {
                            System.err.println("  The substring = " + grid[k].substring(j, j+c));
                            found &= subgrid[k-i].equals(grid[k].substring(j, j+c));
                        }
                    }
                }
            }
        }
    */
    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        for (int i = 0; i < P.size(); i++) {
            boolean finalResult = false;
            String pattern = P.get(i);
            for (int j = 0; j < G.size(); j++) {
                String grid = G.get(j);
                int patternLength = pattern.length();
                char patternChar = pattern.charAt(0);
                for (int k = 0; k < grid.length(); k++) {
                    char gridChar = grid.charAt(k);
                    if (gridChar == patternChar && grid.length() > (k + patternLength)) {
                        String substring = grid.substring(k, k + patternLength);
                        if (substring.equalsIgnoreCase(pattern)) {
                            System.out.println("subString: " + substring + ", pattern: " + pattern);
                            System.out.println("YES");
                            j = G.size() + 1;
                            finalResult = true;
                            break;
                        }
                    }
                }
            }
            if (!finalResult) {
                return "NO";
            }
        }
        return "YES";
    }
}
