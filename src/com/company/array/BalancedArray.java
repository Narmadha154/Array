package com.company.array;

import java.util.Scanner;

public class BalancedArray {
    public static long balArr () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long sum1=0,sum2=0;
        for(int i=0;i<size;i++){
            if(i<size/2){
                sum1=sum1+arr[i];
            }
            else{
                sum2=sum2+arr[i];
            }
        }
        if(sum2>sum1){
            return (sum2-sum1);
        }
        return (sum1-sum2);
    }
}
