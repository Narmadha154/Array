package com.company.array;

import java.util.Scanner;

public class Search {
    public static int searchInsertPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int max=arr[size-1];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                return i;
            }
            else if(target<max&&target>min){
                if (target > arr[i] && target < arr[i + 1]) {
                    return i + 1;
                }
            }
            else if(target>max){
                return size;
            }
        }
        return 0;
    }
}
