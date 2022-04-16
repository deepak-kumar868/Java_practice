package com.company;
import java.util.*;
public class Tut4_Selection_sort {
    public static void main(String[] args) {
        int []arr={6,3,8,2,9};
        for (int i = 0; i <5 ; i++) {
            for(int j=i+1;j<5;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Element of array after sorting the element is:");
        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
