package com.company;

import java.util.Scanner;

public class Tut6_Insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array after sorting is:");
        for (int i = 1; i <n ; i++) {
            int j=i-1;
            int current=arr[i];
            while (j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("Element after sorting is:");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
