package com.company.array;

import java.util.Scanner;

public class ContiguousSubAr {
    public static int [] findSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum:");
        int sum = sc.nextInt();
        int k=0;
        int [] newArr=new int[2];
        for(int i=0;i<size;i++){
            long subArrSum=0;
            for(int j=i;j<size;j++) {
                subArrSum += arr[j];
                if (subArrSum == sum) {
                   newArr[k++]=i+1;
                   newArr[k++]=j+1;
                   return newArr;
                }
            }
        }
        return newArr;
    }
}
