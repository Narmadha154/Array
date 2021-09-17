package com.company.array;

import java.util.Scanner;

public class ContiguousSubAr {
    public static void findSum() {
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
        int k=0,l=0,position=0;
        for(int i=0;i<size;i++){
            long subArrSum=0;
           for(int j=i;j<size;j++) {
               subArrSum += arr[j];
               if (subArrSum == sum) {
                   k=i;
                   l=j;
               }
               if((l-k)>position||(k-l)>position){
                   position=l-k;
                   k=i;
                   l=j;
               }
           }
        }
        System.out.println(k+" "+l);
    }
}
