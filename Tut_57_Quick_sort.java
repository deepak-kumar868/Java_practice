package com.company;

import java.util.*;
public class Tut_57_Quick_sort {
    public static int part(int[]arr,int s,int e) {
        int pivot = arr[s];
        int i=s+1;
        int j=e;
        while (i<j) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[s];
        arr[s]=arr[j];
        arr[j]=temp;
        return j;
    }

    public static void Quick(int []arr,int s,int e){
        if (s<e){
            int pivot=part(arr,s,e);
            part(arr,s,pivot-1);
            part(arr,pivot+1,e);
        }
    }

    public static void main(String[] args) {
        int []arr=new int[]{7,5,9,3,56,4};
        Quick(arr,0,5);
        for (int i = 0; i <6 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
