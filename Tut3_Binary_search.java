package com.company;
import java.util.*;
public class Tut3_Binary_search {
    static void Binary_search(int []arr,int l,int k){
        int start=0;
        int end=l;
        while (start<end){
            int mid=(start+end)/2;
            if (k==arr[mid]){
                System.out.println("Match found");
                return;
            }
            else if (k>arr[mid]){
                start=mid+1;
            }
            else if(k<arr[mid]){
                end=mid-1;
            }
        }
        System.out.println("Match not found");
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int l;
        l=sc.nextInt();
        int []arr=new int[l];
        System.out.println("Enter the element of array");
        for (int i = 0; i <l ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the vlaue of key");
        int key;
        key=sc.nextInt();
        Binary_search(arr,l,key);
    }
}
