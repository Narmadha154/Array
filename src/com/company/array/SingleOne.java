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
        int count=0;
        for(int i=0;i<size;i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }
}
