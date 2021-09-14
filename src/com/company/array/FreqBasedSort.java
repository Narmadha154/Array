package com.company.array;

import java.util.Scanner;

public class FreqBasedSort {
    public static void sortFreqBased() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int [] freq=new int[20];
        for(int i=0;i<size;i++){
            (freq[arr[i]])++;
        }
      /*  for(int i=0;i<10;i++){
            System.out.println(freq[i]);
        }*/
        for(int i=0;i<10;i++){
            if(freq[i]!=0){
                int j=i;
                if(freq[j]>freq[j+1]){
                    while(freq[j]!=0){
                        System.out.println(j);
                        (freq[j])--;
                    }
                }
                else if(freq[j]==freq[j+1]){
                    while(freq[j]!=0){
                        System.out.println(j);
                        (freq[j])--;
                    }
                }
            }
        }
    }
}
