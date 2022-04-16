package com.company;
import java.util.Scanner;
public class Tut15_Subarray_challenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=0;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            for(int j=i;j<n;j++){
                int s=0;
                for(int k=i;k<=j;k++){
                    s+=arr[k];
                }
                if(s>sum){
                    sum=s;
                }
            }
        }
        System.out.println("The maximum sum is:"+sum);


        //------------Comulative approach
    }
}
