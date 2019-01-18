package com.jj.numberapp.number.services;

import java.util.Arrays;

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

    public static void getFavoriteNumber() {

        int arr[] = {99, 12, 65, 34, 86, 23, 99, 0, 12, 75, 55};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int key = 75;
        int last = arr.length - 1;
        int result = binarySearch (arr,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("\nElement is found at index: "+result);
    }

    private static int binarySearch(int[] arr, int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, first, mid-1, key);   // search in left subarray
            } else {
                return binarySearch(arr, mid+1, last, key);    // search in right subarray
            }
        }
        return -1;
    }
}

