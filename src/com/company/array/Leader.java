package com.company.array;

import java.util.Scanner;

public class Leader {
    public static void findLeader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        /* for(int i=0;i<n-1;i++){
            int j=i+1,count=0;
            while(j<n&&arr[i]>=arr[j]){
                count++;
                j++;
            }
            if(count==n-1-i){
                list.add(arr[i]);
            }
        }
        list.add(arr[n-1]);*/
       /* int j;
        for(int i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]<arr[j]) {
                    break;
                }
            }
            if(j==size) {
                System.out.println("leader element:" + arr[i]);
               // list.add(arr[i]);
            }
        }*/
        int max=arr[size-1];
        System.out.println(max);
        for(int i=size-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}
