package com.company.array;
import java.util.Scanner;
public class RearrangeArray {

    public static void rearrangeArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int [] posArr=new int[size];
        int [] negArr=new int[size];
        int k=0,l=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                posArr[k++]=arr[i];
            }
            else{
                negArr[l++]=arr[i];
            }
        }
        int s=0,t=0;
        for(int i=0;i<size;i++){
            if(i%2==0){
                arr[i]=posArr[s++];
            }
            else{
                arr[i]=negArr[t++];
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
