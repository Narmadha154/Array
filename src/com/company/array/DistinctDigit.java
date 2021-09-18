package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctDigit {
    public static void findDistinctDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] digitArr = new int[(size*size)];
        int k=0,i=0;
        while(i<size){
            int num=arr[i];
            while(num>0){
                int rem=num%10;
                digitArr[k]=rem;
                num=num/10;
                k++;
            }
            i++;
        }
        for(i=0;i<k;i++){
            System.out.print(digitArr[i]+"\t");
        }
        Arrays.sort(digitArr);
        int l=0;
        for(i=0;i<(size*size)-1;i++){
            if(digitArr[i]!=0) {
                if (digitArr[i] != digitArr[i + 1]) {
                    digitArr[l++] = digitArr[i];
                }
            }
        }
        digitArr[l++]=digitArr[(size*size)-1];
        System.out.println("arr:");
        for(i=0;i<l;i++){
            System.out.println(digitArr[i]+"\t");
        }
    }
}
