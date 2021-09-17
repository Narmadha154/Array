package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallNthLarge {
    public static void findSmallLarge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k:");
        int k = sc.nextInt();
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        Arrays.sort(arr);
        int small=arr[k-1];
        int large=arr[size-n];
        int sum=small+large;
        System.out.println(small);
        System.out.println(large);
        System.out.println(sum);
    }
}
