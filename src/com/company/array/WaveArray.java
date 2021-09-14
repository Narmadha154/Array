package com.company.array;

import java.util.Scanner;

public class WaveArray {
    public static void sortWaveForm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (size % 2 != 0) {
            for (int i = 0; i < size - 1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        } else {
            for (int i = 0; i < size; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
