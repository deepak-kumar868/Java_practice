package com.company;

import java.util.Scanner;

public class Tut37_Recursion_challenge2 {
    public static void inc(int n){
        if (n==0){
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }

    public static void dec(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        dec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        inc(n);
        System.out.println("");
        dec(n);
    }
}
