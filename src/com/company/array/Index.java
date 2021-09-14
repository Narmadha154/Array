package com.company.array;

import java.util.Scanner;

public class Index {
    public static void findIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int index=search(arr,size,key);
        System.out.println(index);
    }
       public static int search(int arr[], int n, int key)
        {
            for(int i=0;i<n;i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
        }
}
