package com.company;

import java.util.Scanner;

public class Tut33_Recursion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The sum of "+n+" natural number is:"+sum(n));
    }
}
