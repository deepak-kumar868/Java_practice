package com.company;

public class Tut_61_Wave_sort {
    public static void main(String[] args) {
        int []arr=new int[]{4,5,6,7,8,9};
        for (int i = 1; i <arr.length-1 ; i+=2) {
            if (arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            if (arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
