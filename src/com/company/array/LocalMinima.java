package com.company.array;

import java.util.Scanner;

public class LocalMinima {
    public static void findLocalMinima() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i==0){
                if(arr[i]<arr[i+1]){
                    System.out.println(arr[i]);
                }
            }
            else if(i==size-1){
                if(arr[i]<arr[i-1]){
                    System.out.println(arr[i]);
                }
            }
            else{
                if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
