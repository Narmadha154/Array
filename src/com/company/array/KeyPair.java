package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class KeyPair {
    public static boolean findKeyPair() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        /*boolean val = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j])== key) {
                    val = true;
                }
            }
        }
        return val;
    }*/
        Arrays.sort(arr);
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (arr[left] + arr[right] == key) {
                return true;
            } else if (arr[left] + arr[right] < key) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
