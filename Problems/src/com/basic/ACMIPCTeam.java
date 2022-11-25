package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACMIPCTeam {
    public static void main(String[] args) {

        List<String> topic = Arrays.asList("10101",
                "11110",
                "00010");
        System.out.println(ACMIPCTeam.acmTeam(topic));
    }

    public static List<Integer> acmTeam(List<String> topics) {
        // Write your code here
        int resultMaxTopic = 0;
        int resultMaxTeam = 0;
        List<Integer> result = new ArrayList<>(2);
        for (int i = 0; i < topics.size(); i++) {
            String topic1 = topics.get(i);
            for (int j = i + 1; j < topics.size(); j++) {
                String topic2 = topics.get(j);
                int maxTopic = 0;
                for (int k = 0; k < topic1.length(); k++) {
                    maxTopic = maxTopic + (topic1.charAt(k) == topic2.charAt(k) ? 1 : 0);
                }
                if (maxTopic > resultMaxTopic) {
                    resultMaxTopic = maxTopic;
                    resultMaxTeam = 1;
                }
                if (maxTopic == resultMaxTopic) {
                    resultMaxTopic = maxTopic;
                    resultMaxTeam++;
                }
            }
        }
        System.out.println(resultMaxTopic + " " + resultMaxTeam);
        return result;
    }
}
