package com.company;

public class Tut_38_Recursion_Challenge3 {
    public static int fiocc(int []arr,int n,int i,int key){
        if (i==n){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fiocc(arr,n,i+1,key);
    }

    public static int laocc(int[]arr,int n,int i,int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return laocc(arr,n,i-1,key);
    }

    public static void main(String[] args) {
        int []arr=new int[]{4,7,5,9,2,4,5,7,8,2};
        System.out.println(fiocc(arr,10,0,7));
        System.out.println(laocc(arr,10,9,4));
    }
}
