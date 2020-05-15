package com.codechef.utility;

import java.util.Arrays;

public class ArrayUtils {

    public static void printArr(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printArr(char[][] arr) {
        for (char[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static <T> void printArr(T[][] arr) {
        for (T[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printSubArr(int[] arr, int startInclusive, int endExclusive) {
        for (int i = startInclusive; i < endExclusive; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
