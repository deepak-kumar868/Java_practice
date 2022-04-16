package com.company;
import java.util.*;
public class Tu27_Biggest_Numbers {
    public static void main(String[] args) {
        String str="9345348";
        System.out.println("The Biggest numbers made by this string is:");
        char []arr=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=arr[i];
        }
        System.out.println(reverse);
    }
}
