package com.company;

import java.util.Scanner;

public class Tut9_Subarray2 {
    public static void main(String[] args) {
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array");
         n=sc.nextInt();
         int []arr=new int[n];
         System.out.println("Enter the element of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        int ans=2;
        int curr=2;
        int pd=arr[1]-arr[0];

        for (int i = 2; i <n ; i++) {
            if (pd==arr[i]-arr[i-1]){
                curr++;
            }
            else{
                pd=arr[i]-arr[i-1];
                curr=2;
            }
            if (curr>ans){
                ans=curr;
            }
        }
        System.out.println(ans);
    }
}
