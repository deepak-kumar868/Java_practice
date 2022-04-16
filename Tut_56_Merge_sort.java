package com.company;

public class Tut_56_Merge_sort {

    public static void merge(int []arr,int s,int mid,int e){
        int n1=mid-s+1;
        int n2=e-mid;
        int []arr1=new int[n1];
        int []arr2=new int[n2];

        for (int i = 0; i <n1 ; i++) {
            arr1[i]=arr[i];
        }
        for (int i = 0; i <n2 ; i++) {
            arr2[i]=arr[mid+1+i];
        }
        int k=0;
        int i=0;
        int j=0;
        while (i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]>arr2[j]){
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }

        while (i<n1){
                arr[k]=arr1[i];
                i++;
                k++;
        }

        while (j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return;
    }

    public static void mergesort(int[]arr,int s,int e){
        if(s<e) {
            int mid=(s+e)/2;
            mergesort(arr, s, mid);
            mergesort(arr, mid + 1, e);
            merge(arr, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int []arr=new int[]{3,5,7,2,8,9,4};
        mergesort(arr,0,6);
        for (int i = 0; i <6 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
