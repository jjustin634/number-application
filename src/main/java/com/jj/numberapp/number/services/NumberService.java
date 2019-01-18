package com.jj.numberapp.number.services;

public class NumberService {
    public static void getBubbleSort() {

        int[] favoriteNumbers = {2, 55, 89, 100, 0, 10002, 286, 33, 88, 2, 7, 90, 77, 54, 12, 34, 66, 99, 101, 43, 996};

        for (int i : favoriteNumbers) {
            for (int j = 0; j < favoriteNumbers.length - 1; j++) {
                if (favoriteNumbers[j] > favoriteNumbers[j+1]) {
                    int temp = favoriteNumbers[j];
                    favoriteNumbers[j] = favoriteNumbers[j+1];
                    favoriteNumbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < favoriteNumbers.length; i++) {
            System.out.print(favoriteNumbers[i] + " ");
        }
    }
}
