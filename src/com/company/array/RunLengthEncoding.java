package com.company.array;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void encode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String newStr="";
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=""+str.charAt(i)+count;
        }
        System.out.println(newStr);
    }
}
