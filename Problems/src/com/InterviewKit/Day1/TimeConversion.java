package com.InterviewKit.Day1;

public class TimeConversion {
    public static void main(String[] args) {

        String time = "12:00:01PM";//"12:00:01AM";//"07:05:45PM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String result = "";
        boolean isAm = 'A' == (s.charAt(8));
        if (isAm) {
            if (s.startsWith("12")) {
                result = "00" + s.substring(2, 8);
                return result;
            }
            result = s.substring(0, 8);
            return result;

        } else {
            if (s.startsWith("12")) {
                result = s.substring(0, 8);
                return result;
            }
            int hrValue = Integer.valueOf(s.substring(0, 2));
            result = (hrValue + 12) + s.substring(2, 8);
            return result;
        }
    }
}
