package com.company;
import java.util.*;
public class Tut14_Subarray_challenge1 {
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
        int start=0;
        int end=0;
        for (int i = 0; i <n ; i++) {
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
    }
}
