package com.company;

import java.util.Scanner;

public class Tut29_Eratosthenses {
    public static void primeNumber(int n){
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i;
        }

        for (int i = 2; i <n ; i++) {
            if(arr[i]!=0){
                for (int j = i*i; j <n ; j+=i) {
                    arr[j]=0;
                }
            }
        }
        System.out.println("Prime number upto this given number is:");
        for (int i = 2; i <n ; i++) {
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        primeNumber(n);
    }
}
