package com.company;

import java.util.Scanner;

public class Tut30_Smallest_primeFactor {
    public static void primeFactor(int n){
        int []arr=new int[100];
        for (int i = 0; i <100 ; i++) {
            arr[i]=i;
        }

        for (int i = 2; i <100 ; i++) {
            if(arr[i]==i){
                for (int j = i*i; j <100 ; j+=i) {
                    if(arr[j]==j) {
                        arr[j] = i;
                    }
                }
            }
        }
        System.out.println("The smallest prime factor of given number is:"+arr[n]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        primeFactor(n);
    }
}
