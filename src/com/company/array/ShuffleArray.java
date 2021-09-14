package com.company.array;

import java.util.Scanner;

public class ShuffleArray {
    public static void shuffle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 0,j=n; i < n; i++,j++) {
            System.out.println(arr[i]);
            System.out.println(arr[j]);
        }
    }
}
