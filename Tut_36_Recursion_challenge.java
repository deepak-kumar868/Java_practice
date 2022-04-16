package com.company;

import java.util.Scanner;

public class Tut_36_Recursion_challenge {
    public static boolean sort(int []arr,int n){
        if(n==1){
            return true;
        }
        return ((arr[n-2] <= arr[n-1]) && sort(arr, n - 1));
    }

    public static void main(String[] args) {
        int []arr=new int[]{34,42,67,88,99};
        System.out.println(sort(arr,5));
    }
}
