package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/luck-balance/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
public class LuckBalance {
    public static void main(String[] args) {

        List<List<Integer>> contest = new ArrayList<>();
/*
        contest.add(Arrays.asList(5, 1));
        contest.add(Arrays.asList(2, 1));
        contest.add(Arrays.asList(1, 1));
        contest.add(Arrays.asList(8, 1));
        contest.add(Arrays.asList(10, 0));
        contest.add(Arrays.asList(5, 0));
*/

/*
        contest.add(Arrays.asList(5351, 0));
        contest.add(Arrays.asList(1870, 0));
        contest.add(Arrays.asList(9359, 0));
        contest.add(Arrays.asList(6828, 0));
        contest.add(Arrays.asList(9896, 0));
        contest.add(Arrays.asList(6335, 0));
        contest.add(Arrays.asList(38, 0));
        contest.add(Arrays.asList(2440, 0));
        contest.add(Arrays.asList(4627, 0));
        contest.add(Arrays.asList(2663, 0));
        contest.add(Arrays.asList(6300, 0));
        contest.add(Arrays.asList(107, 0));
        contest.add(Arrays.asList(4605, 0));
        contest.add(Arrays.asList(5437, 0));
        contest.add(Arrays.asList(4394, 0));
        contest.add(Arrays.asList(7530, 0));
        contest.add(Arrays.asList(8254, 0));
        contest.add(Arrays.asList(5668, 0));
        contest.add(Arrays.asList(6945, 0));
        contest.add(Arrays.asList(1539, 0));
        contest.add(Arrays.asList(1323, 0));
        contest.add(Arrays.asList(1841, 0));
        contest.add(Arrays.asList(2191, 0));
        contest.add(Arrays.asList(8943, 0));
        contest.add(Arrays.asList(7645, 0));
        contest.add(Arrays.asList(3903, 0));
        contest.add(Arrays.asList(4772, 0));
        contest.add(Arrays.asList(2392, 0));
        contest.add(Arrays.asList(1539, 0));
        contest.add(Arrays.asList(7712, 0));
        contest.add(Arrays.asList(9955, 0));
        contest.add(Arrays.asList(9895, 0));
        contest.add(Arrays.asList(7422, 0));
        contest.add(Arrays.asList(4665, 0));
        contest.add(Arrays.asList(5448, 0));
        contest.add(Arrays.asList(2317, 0));
        contest.add(Arrays.asList(6963, 0));
        contest.add(Arrays.asList(9170, 0));
        contest.add(Arrays.asList(2860, 0));
        contest.add(Arrays.asList(3812, 0));
        contest.add(Arrays.asList(5725, 0));
        contest.add(Arrays.asList(1324, 0));
        contest.add(Arrays.asList(7377, 0));
        contest.add(Arrays.asList(5538, 0));
        contest.add(Arrays.asList(2383, 0));
        contest.add(Arrays.asList(7674, 0));
        contest.add(Arrays.asList(5142, 0));
        contest.add(Arrays.asList(3932, 0));
        contest.add(Arrays.asList(2624, 0));
        contest.add(Arrays.asList(8704, 0));
        contest.add(Arrays.asList(5706, 0));
        contest.add(Arrays.asList(2649, 0));
        contest.add(Arrays.asList(6730, 0));
        contest.add(Arrays.asList(8757, 0));
        contest.add(Arrays.asList(2930, 0));
        contest.add(Arrays.asList(4465, 0));
        contest.add(Arrays.asList(6119, 0));
        contest.add(Arrays.asList(4967, 0));
        contest.add(Arrays.asList(8717, 0));
        contest.add(Arrays.asList(334, 0));
        contest.add(Arrays.asList(9962, 0));
        contest.add(Arrays.asList(293, 0));
        contest.add(Arrays.asList(1943, 0));
        contest.add(Arrays.asList(8146, 0));
        contest.add(Arrays.asList(4085, 0));
        contest.add(Arrays.asList(779, 0));
        contest.add(Arrays.asList(9630, 0));
        contest.add(Arrays.asList(1843, 0));
        contest.add(Arrays.asList(289, 0));
        contest.add(Arrays.asList(2083, 0));
        contest.add(Arrays.asList(9742, 0));
        contest.add(Arrays.asList(5891, 0));
        contest.add(Arrays.asList(2996, 0));
        contest.add(Arrays.asList(7447, 0));
        contest.add(Arrays.asList(4371, 0));
        contest.add(Arrays.asList(1102, 0));
        contest.add(Arrays.asList(6501, 0));
        contest.add(Arrays.asList(492, 0));
        contest.add(Arrays.asList(3806, 0));
        contest.add(Arrays.asList(3549, 0));
        contest.add(Arrays.asList(9719, 0));
        contest.add(Arrays.asList(9913, 0));
        contest.add(Arrays.asList(9265, 0));
        contest.add(Arrays.asList(8468, 0));
        contest.add(Arrays.asList(5007, 0));
        contest.add(Arrays.asList(1479, 0));
        contest.add(Arrays.asList(2758, 0));
        contest.add(Arrays.asList(1727, 0));
        contest.add(Arrays.asList(5548, 0));
        contest.add(Arrays.asList(6869, 0));
        contest.add(Arrays.asList(154, 0));
        contest.add(Arrays.asList(42, 0));
        contest.add(Arrays.asList(6309, 0));
        contest.add(Arrays.asList(9041, 0));
        contest.add(Arrays.asList(3036, 0));
        contest.add(Arrays.asList(3282, 0));
        contest.add(Arrays.asList(4828, 0));
        contest.add(Arrays.asList(7036, 0));
        contest.add(Arrays.asList(8724, 0));
*/
        contest.add(Arrays.asList(437, 1));
        contest.add(Arrays.asList(68, 0));
        contest.add(Arrays.asList(319, 0));
        contest.add(Arrays.asList(565, 0));
        contest.add(Arrays.asList(307, 1));
        contest.add(Arrays.asList(512, 0));
        contest.add(Arrays.asList(493, 0));
        contest.add(Arrays.asList(30, 0));
        contest.add(Arrays.asList(557, 0));
        contest.add(Arrays.asList(367, 0));
        contest.add(Arrays.asList(547, 1));
        contest.add(Arrays.asList(263, 0));
        contest.add(Arrays.asList(481, 0));
        contest.add(Arrays.asList(78, 0));
        contest.add(Arrays.asList(492, 1));
        contest.add(Arrays.asList(56, 1));
        contest.add(Arrays.asList(81, 0));
        contest.add(Arrays.asList(154, 0));
        contest.add(Arrays.asList(503, 1));
        contest.add(Arrays.asList(375, 0));
        contest.add(Arrays.asList(152, 0));
        contest.add(Arrays.asList(401, 0));
        contest.add(Arrays.asList(226, 0));
        contest.add(Arrays.asList(482, 0));
        contest.add(Arrays.asList(264, 0));
        contest.add(Arrays.asList(52, 0));
        contest.add(Arrays.asList(9, 0));
        contest.add(Arrays.asList(145, 0));
        contest.add(Arrays.asList(72, 0));
        contest.add(Arrays.asList(293, 0));
        contest.add(Arrays.asList(15, 0));
        contest.add(Arrays.asList(42, 1));
        contest.add(Arrays.asList(305, 0));
        contest.add(Arrays.asList(34, 0));
        contest.add(Arrays.asList(509, 0));
        contest.add(Arrays.asList(156, 0));
        contest.add(Arrays.asList(321, 0));
        contest.add(Arrays.asList(437, 0));
        contest.add(Arrays.asList(510, 1));
        contest.add(Arrays.asList(449, 0));
        contest.add(Arrays.asList(79, 0));
        contest.add(Arrays.asList(492, 0));
        contest.add(Arrays.asList(191, 0));
        contest.add(Arrays.asList(354, 1));
        contest.add(Arrays.asList(529, 0));
        contest.add(Arrays.asList(315, 0));
        contest.add(Arrays.asList(384, 0));
        contest.add(Arrays.asList(371, 0));
        contest.add(Arrays.asList(100, 0));
        contest.add(Arrays.asList(480, 0));
        contest.add(Arrays.asList(408, 0));
        contest.add(Arrays.asList(221, 0));
        contest.add(Arrays.asList(286, 0));
        contest.add(Arrays.asList(551, 0));
        contest.add(Arrays.asList(106, 0));
        contest.add(Arrays.asList(123, 0));
        contest.add(Arrays.asList(549, 0));
        contest.add(Arrays.asList(183, 1));
        contest.add(Arrays.asList(428, 0));
        contest.add(Arrays.asList(435, 0));
        contest.add(Arrays.asList(370, 0));
        contest.add(Arrays.asList(46, 0));
        contest.add(Arrays.asList(289, 0));
        contest.add(Arrays.asList(246, 0));
        contest.add(Arrays.asList(414, 1));
        contest.add(Arrays.asList(159, 0));
        contest.add(Arrays.asList(442, 0));
        contest.add(Arrays.asList(286, 0));
        contest.add(Arrays.asList(21, 0));
        contest.add(Arrays.asList(119, 0));
        contest.add(Arrays.asList(263, 0));
        contest.add(Arrays.asList(572, 0));
        contest.add(Arrays.asList(334, 0));
        contest.add(Arrays.asList(96, 0));
        contest.add(Arrays.asList(307, 0));
        contest.add(Arrays.asList(323, 0));
        contest.add(Arrays.asList(554, 1));
        contest.add(Arrays.asList(487, 0));
        contest.add(Arrays.asList(455, 1));
        contest.add(Arrays.asList(399, 0));
        contest.add(Arrays.asList(559, 0));
        contest.add(Arrays.asList(276, 0));
        contest.add(Arrays.asList(357, 1));
        contest.add(Arrays.asList(586, 0));
        contest.add(Arrays.asList(346, 0));
        contest.add(Arrays.asList(240, 1));
        contest.add(Arrays.asList(492, 0));
        contest.add(Arrays.asList(63, 0));
        contest.add(Arrays.asList(262, 0));
        contest.add(Arrays.asList(489, 0));
        contest.add(Arrays.asList(124, 1));
        contest.add(Arrays.asList(526, 0));
        contest.add(Arrays.asList(350, 1));
        contest.add(Arrays.asList(243, 0));
        contest.add(Arrays.asList(35, 0));
        contest.add(Arrays.asList(292, 0));
        contest.add(Arrays.asList(418, 0));
        contest.add(Arrays.asList(364, 1));
        contest.add(Arrays.asList(41, 1));
        contest.add(Arrays.asList(519, 0));
        int k = 100;//99;//3;
        System.out.println(luckBalance(k, contest));
    }

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        List<List<Integer>> nonZeroList = contests.stream().filter(v -> v.get(1) == 1).collect(Collectors.toList());
        int result = contests.stream().filter(v -> v.get(1) == 0).
                map(v -> v.get(0)).mapToInt(Integer::intValue).sum();

        nonZeroList = nonZeroList.stream().sorted((o1, o2) -> {
            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                int c = o1.get(i).compareTo(o2.get(i));
                if (c != 0) {
                    return c;
                }
            }
            return Integer.compare(o1.size(), o2.size());
        }).collect(Collectors.toList());
        int i = 0;
        while (nonZeroList.size() > i && k > i) {
            result = result + nonZeroList.get(nonZeroList.size() - 1 - i).get(0);
            i++;
        }
        while (i < nonZeroList.size()) {
            result = result - nonZeroList.get(nonZeroList.size() - 1 - i).get(0);
            i++;
        }
        return result;
    }
    /*
    public static int luckBalance(int k, List<List<Integer>> contests) {

        int result = 0;
        for (List<Integer> subList : contests) {
            if (subList.get(1) == 0) {
                result = result + subList.get(0);
            }
        }
        List<Integer> oneValueArray = new ArrayList<>();
        int index = 0;
        for (List<Integer> subList : contests) {
            if (subList.get(1) == 1) {
                int newValue = subList.get(0);
                index = oneValueArray.size();
                if (oneValueArray.size() == 0) {
                    oneValueArray.add(newValue);
                }
                while (index > 0) {
                    int oldValue = oneValueArray.get(index - 1);
                    if (oldValue > newValue) {
                        oneValueArray.set(index - 1, newValue);
                        if (oneValueArray.size() == index) {
                            oneValueArray.add(oldValue);
                        } else {
                            oneValueArray.set(index, oldValue);
                        }
                    } else {
                        oneValueArray.add(newValue);
                        break;
                    }
                    index--;
                }
            }
        }
        return result;
    }*/

}
