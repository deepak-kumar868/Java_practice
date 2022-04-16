package com.company;

import java.util.Scanner;

public class Tut32_gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        while(a!=0){
            int rem=n%a;
            n=a;
            a=rem;
        }
        System.out.println("The GCD of n and a is:"+n);
    }
}
