package com.company.array;

import java.util.Scanner;

public class MinDistance {
    public static void findMinDis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value for x:");
        int x = sc.nextInt();
        System.out.println("Enter the value for y:");
        int y = sc.nextInt();
        int p=-1,minDis=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]==x||arr[i]==y){
                if(p!=-1&&(arr[i]!=arr[p])){
                    minDis=Math.min(minDis,i-p);
                }
                p=i;
            }
        }
        if(minDis==Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else{
            System.out.println(minDis);
        }
    }
}
