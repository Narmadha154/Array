package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class UnionArray {
    public static void findUnionArrLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array1:");
        int size1 = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr1= new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of an array2:");
        int size2 = sc.nextInt();
        System.out.println("Enter the array2 elements:");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int [] arr3=new int [size1+size2];
        int k=0;
        for(int i=0;i<size1;i++){
            arr3[k++]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            arr3[k++]=arr2[i];
        }
        Arrays.sort(arr3);
        int l=0;
        for(int i=0;i<k-1;i++) {
            if (arr3[i] != arr3[i + 1]) {
                arr3[l++] = arr3[i];
            }
        }
        arr3[l++]=arr3[k-1];
        for(int i=0;i<l;i++){
            System.out.println(arr3[i]);
        }
        System.out.println("length is: "+arr3.length);
    }
}
