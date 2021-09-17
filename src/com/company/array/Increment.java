package com.company.array;

import java.util.Scanner;

public class Increment {
    public static void incrementArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int number=0;
        for(int i=0;i<size;i++){
            number=number*10+arr[i];
        }
        number++;
        System.out.println(number);
        int k=0;
        int [] newArr=new int[size+10];
        while(number>0){
            int rem=number%10;
            newArr[k++]=rem;
            number=number/10;
        }
        for(int i=k-1;i>=0;i--){
            System.out.println(newArr[i]);
        }
    }
}
