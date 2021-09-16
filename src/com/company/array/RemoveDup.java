package com.company.array;

import java.util.Scanner;

public class RemoveDup {
    public static void remDup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k++] = arr[i];
            }
        }
        arr[k++] = arr[size - 1];
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }    
}
