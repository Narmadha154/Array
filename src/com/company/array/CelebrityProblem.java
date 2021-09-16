package com.company.array;

import java.util.Scanner;

public class CelebrityProblem {
    public static int celebrity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n = sc.nextInt();
        int[][] M = new int[n][n];
        System.out.println("enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i] += M[i][j];
                arr2[j] += M[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr2[i] == n - 1 && arr1[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
