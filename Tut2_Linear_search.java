package com.company;

import java.util.*;
public class Tut2_Linear_search {
    static void Linear_search(int []arr,int key){
        for (int i = 0; i <5 ; i++) {
            if (arr[i]==key){
                System.out.println("Match found");
                return;
            }
        }
        System.out.println("Match not found");
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
       System.out.println("Enter the element of array");
        for (int i = 0; i <5 ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the value of key");
        int key;
        key=sc.nextInt();
        Linear_search(arr,key);
    }
}
