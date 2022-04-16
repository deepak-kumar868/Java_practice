package com.company;

import java.util.Scanner;

public class Tut8_Subarray1 {
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
        for (int i = 0; i <n ; i++) {
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }
}
