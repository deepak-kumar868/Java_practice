package com.company;
import java.util.*;
public class Tut25_Palindrome_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse=reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("The given string is palindrome string");
        }
        else{
            System.out.println("The given string is not a palindrome string");
        }
    }
}
