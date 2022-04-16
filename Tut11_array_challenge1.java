package com.company;
import java.util.*;
public class Tut11_array_challenge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        System.out.println("Enter the element of array");
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int mindx=9999999;
        int N=10000;
        int []idx=new int[N];
        for (int i = 0; i <N ; i++) {
            idx[i]=-1;
        }

        for (int i = 0; i <n ; i++) {
            if (idx[arr[i]]==-1) {
                idx[arr[i]] = i;
            }
            else{
                if (mindx>idx[arr[i]]) {
                    mindx = idx[arr[i]];
                }
            }
        }
        if (mindx==9999999){
            System.out.println("In this array there are no repeating element");
        }
        else {
            System.out.println("The minimum repeating element are:"+mindx);
        }
    }
}
