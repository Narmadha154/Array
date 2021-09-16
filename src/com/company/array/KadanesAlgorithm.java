package com.company.array;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void maxSubArraySum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long maxSum=arr[0], subArrSum=0;
        for(int i=0;i<size;i++){
                subArrSum+=arr[i];
                if(subArrSum>maxSum){
                    maxSum=subArrSum;
                }
                if(subArrSum<0){
                    subArrSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
