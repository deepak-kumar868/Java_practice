package com.company;

import java.lang.reflect.Array;

public class Tut_60_DNF_sort {
    public static void DNF(int[]arr,int n){
        int low=0;
        int mid=0;
        int h=n-1;
        while (mid<=h){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }

            else if (arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[h];
                arr[h]=temp;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr=new int[]{0,1,1,0,0,2,2,1};
        DNF(arr,8);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
