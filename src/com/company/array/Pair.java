package com.company.array;

import java.util.Scanner;

public class Pair {
    public static void sumPairs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum to be checked:");
        int sum = sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]+arr[j])==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
