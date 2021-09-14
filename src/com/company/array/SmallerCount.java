package com.company.array;

import java.util.Scanner;

public class SmallerCount {
    public static void countSmaller() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] countArr = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] > arr[j]) {
                    (countArr[i])++;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(countArr[i]+"\t");
        }
    }
}
