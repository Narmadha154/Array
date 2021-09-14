package com.company.array;

import java.util.Scanner;

public class Rotate {
    public static void rotateArr(int [] arr,int n,int d){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void rotateLeft(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        System.out.println("Enter the size of the rotation:");
        int d=sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<d;i++){
            rotateArr(arr,size,d);
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
