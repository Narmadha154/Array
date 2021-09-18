package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleOne {
    public static void findSingleOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<size;i++) {
            int count=0;
           if(i<size-1&&arr[i]==arr[i+1]){
               count++;
               i++;
           }
           else if(i==size-1&&count==0){
               System.out.println(arr[i]);
           }
           if (i<size-1&&count == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
