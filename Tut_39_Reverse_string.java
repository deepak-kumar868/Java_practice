package com.company;

import java.util.Scanner;

public class Tut_39_Reverse_string {
    public static void reverse(String str){
        if (str.length()==0){
            return;
        }
        String str2=str.substring(1);
        reverse(str2);
        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println("Reverse of string is:");
        reverse(str);
    }
}
