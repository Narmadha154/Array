package com.company.array;

import java.util.Scanner;

public class SevenUp {
    public static void findDivisible() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0]+"\t");
        for(int i=1;i<size-1;i++){
            if(arr[i]%7==0){
                System.out.print(arr[i+1]+"\t");
            }
        }
    }
}
