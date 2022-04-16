package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Tut_59_count_sort {
    public static void main(String[] args) {
        int []arr=new int[]{4,6,2,8,7,4,6,7,8,2,1};
        int mx=-234;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>mx){
                mx=arr[i];
            }
        }

        int []arr1=new int[mx+1];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=0;
        }

        for (int i = 0; i <arr.length ; i++) {
            arr1[arr[i]]++;
        }

        int j=0;
        for (int i = 0; i <arr1.length ; i++) {
            while (arr1[i]!=0){
                arr[j]=i;
                j++;
                arr1[i]--;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
