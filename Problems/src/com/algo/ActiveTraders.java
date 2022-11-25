package com.algo;

import java.util.*;
import java.util.stream.Collectors;

public class ActiveTraders {
    public static void main(String[] args) {

        System.out.println(mostActive(Arrays.asList("Alpha", "Omega", "Alpha", "Omega", "Alpha",
                "Omega", "Alpha", "Omega", "Alpha", "Omega",
                "Alpha", "Omega", "Alpha", "Omega", "Alpha",
                "Omega", "Alpha", "Omega", "Beta", "Alpha")));
    }

    //https://www.hackerrank.com/test/33gp893pqhs/questions/8dhrrgdc9fa
    public static List<String> mostActive(List<String> customers) {

        List<String> result = new ArrayList<>();
        Map<String, Double> customerCount = new HashMap<>();
        int totalTrades = customers.size();
        for (String customer : customers
        ) {
            customerCount.put(customer, (customerCount.getOrDefault(customer, 0D) + 1));
        }
        result = customerCount.entrySet().stream().filter(k -> {
            double count = k.getValue();
            double percent = (count / totalTrades) * 100;
            return percent >= 5;
        }).map(k -> k.getKey()).sorted().collect(Collectors.toList());
        return result;
    }
}
