package com.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RoadRepair {

    public static void main(String[] args) {

        List<Integer> crew_id = Arrays.asList(5, 9, 4, 3, 8, 2);//Arrays.asList(1, 3, 5);
        List<Integer> job_id = Arrays.asList(9, 8, 1, 10, 1, 4);//Arrays.asList(3, 5, 7);
        System.out.println(getMinCost(crew_id, job_id));
    }

    //https://www.hackerrank.com/test/33gp893pqhs/questions/4ckcpfj371o
    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
        // Write your code here
        int distance = 0;
        Collections.sort(crew_id);
        Collections.sort(job_id);
        for (int i = 0; i < crew_id.size(); i++) {
            distance = distance + Math.abs(job_id.get(i) - crew_id.get(i));
        }
        return distance;
    }
}
