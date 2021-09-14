package com.company.array;

import java.util.Scanner;

public class SubArrSum {
    public static void subArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum=arr[0];
        for(int i=0;i<size;i++){
            int subSum=0;
            for(int j=i;j<size;j++){
                subSum=subSum+arr[j];
                if(subSum>maxSum){
                    maxSum=subSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
