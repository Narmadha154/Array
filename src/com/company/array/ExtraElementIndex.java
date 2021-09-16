package com.company.array;

import java.util.Scanner;

public class ExtraElementIndex {
    public static int findIndexOfExtraElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements:");
        int[] b = new int[size-1];
        for (int i = 0; i < size-1; i++) {
            b[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(a[i]!=b[i]){
                return i;
            }
        }
        return size-1;
    }
}
