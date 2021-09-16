package com.company.array;

import java.util.Scanner;

public class JumpGame {
    public static void findSteps() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int end=0,farthest=0,jump=0;
      /*  for(int i=0;i<size;i++){
            if(arr[i]==size-1-i){
                noOfSteps++;
                break;
            }
            else{
                if(arr[i+1]>arr[i]){
                    noOfSteps=arr[i+1]-arr[i];
                }
                else{
                    noOfSteps=arr[i]-arr[i+1];
                }
            }
        }*/
        for(int i=0;i<size-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
        }
        System.out.println(jump);
    }
}
