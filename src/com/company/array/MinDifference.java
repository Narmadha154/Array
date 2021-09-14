package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinDifference {
    public static void minDiff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff=arr[size-1]-arr[size-2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int diff=0;
                diff=arr[j]-arr[i];
                if(diff<=minDiff){
                    minDiff=diff;
                }
            }
        }
        System.out.println( minDiff);
    }
}
