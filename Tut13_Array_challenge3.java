package com.company;
import java.util.Scanner;
public class Tut13_Array_challenge3 {
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
        boolean []bool=new boolean[n];
        for (int i = 0; i <n ; i++) {
            bool[i]=false;
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]>0){
                bool[arr[i]]=true;
            }
        }
        for (int i = 1; i <n ; i++) {
            if(bool[i]==false){
                System.out.println("The smallest positive missing number in this array is:"+i);
                break;
            }
        }
    }
}
