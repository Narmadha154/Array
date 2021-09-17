package com.company.array;

import java.util.Scanner;

public class SlidingWindow {
    public static int [] getSubString(int [] arr,int length,int k){
        int [] newArr=new int[k];
        int [] maxArr=new int[length];
        int newSize=length-k;
        int temp=0,q=0;
        for(int i=0;i<=newSize;i++){
            int l=i;
            int m=0,count=k;
            while(count!=0){
                newArr[m]=arr[l];
                m++;
                count--;
                l++;
            }
           /* System.out.println("*");
            for(int t=0;t<k;t++){
                System.out.println(newArr[t]);
            }*/
            for(int n=1;n<k;n++){
                for(int r=0;r<k-n;r++){
                    if(newArr[r]>newArr[r+1]){
                        temp=newArr[r];
                        newArr[r]=newArr[r+1];
                        newArr[r+1]=temp;
                    }
                }
            }
            maxArr[q]=newArr[k-1];
            q++;
        }
        return maxArr;
    }
    public static void window() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size:");
        int k=sc.nextInt();
        int [] maxArr=getSubString(arr,size,k);
        System.out.println("array:");
        for(int i=0;i<maxArr.length;i++){
            if(maxArr[i]!=0){
                System.out.println(maxArr[i]);
            }
        }
    }
}
