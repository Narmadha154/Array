package com.company.array;

import java.util.Scanner;

public class PascalsTriangle {
    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int prev=1;
        System.out.print(prev);
        for(int i=1;i<=size;i++){
            int curr=(prev*(size-i+1))/i;
            System.out.print(","+curr);
            prev=curr;
        }
     /*   for(int i=1;i<=size;i++){
            for(int j=0;j<=size-i;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }*/
    }
}
