package com.company;

import java.util.*;
public class Tut5_Bubble_sort {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n;
     n=sc.nextInt();
     int []arr=new int[n];
     for (int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println("Element of array in ascending order");
     int count=1;
        for (int i = 0; i <n-1 ; i++) {
            for(int j=0;j<n-count;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
