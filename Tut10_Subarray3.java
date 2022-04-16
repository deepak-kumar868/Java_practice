package com.company;
import java.util.*;
public class Tut10_Subarray3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        if (n==1){
            System.out.println("1");
            return;
        }
        int []arr=new int[n+1];
        arr[n]=-1;
        int max=-1;
        int ans=0;
        System.out.println("Enter the element of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]>max && arr[i]>arr[i+1]){
                ans++;
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(ans);
    }
}
