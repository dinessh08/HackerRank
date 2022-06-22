package com.basic;

//https://www.hackerrank.com/challenges/library-fine/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class LibraryFine {
    public static void main(String[] args) {

        // System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
//        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1014));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        int fine = (y1 > y2 ? (y1 - y2) * 10000 :
                y2 > y1 ?
                        0 :
                        (m1 > m2 ?
                                (m1 - m2) * 500 :
                                m2 > m1 ?
                                        0 :
                                        d1 > d2 ? (d1 - d2) * 15 : 0));
        return fine;
    }
}
