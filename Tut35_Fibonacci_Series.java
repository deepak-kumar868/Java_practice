package com.company;

import java.util.Scanner;

public class Tut35_Fibonacci_Series {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("The number at "+n+"th position in fibonacci series is:"+fib(n));
    }
}
