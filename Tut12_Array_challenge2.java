package com.company;

import java.util.Scanner;

public class Tut12_Array_challenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int s;
        int start=0;
        int end=0;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        System.out.println("Enter sum");
        s=sc.nextInt();
        int sum=0;
        int[]arr=new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        while(end<n && sum<s){
            sum+=arr[end];
            end++;
        }

        if (sum==s){
            System.out.println("The start index is:0 and end index is:"+end);
            return;
        }

        while (end<n){
            while (sum>s){
                sum-=arr[start];
                start++;
            }
            if (sum==s){
                System.out.println("The start index is:"+start+",and end index is:"+(end-1));
                break;
            }
            sum+=arr[end];
            end++;
        }
    }
}
