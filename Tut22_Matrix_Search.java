package com.company;
import java.util.*;
public class Tut22_Matrix_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of column in Matrix:");
        m=sc.nextInt();
        System.out.println("Enter the number of row in Matrix:");
        n=sc.nextInt();

        int [][]mat=new int[m][n];
        System.out.println("Enter the element of Matrix:");
        for (int i = 0; i <m ; i++) {
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the element that you want to find:");
        int x;
        x=sc.nextInt();
        int start=0;
        int end=n-1;
        boolean flag=false;

        while(start<m && end>=0){
            if (x==mat[start][end]){
                System.out.println("The given element is found at index:"+start +" and "+end);
                flag=true;
                break;
            }
            else if (mat[start][end]<x){
               start++;
            }
            else if(mat[start][end]>x){
                end--;
            }
        }
        if(flag==false){
            System.out.println("Element not found");
        }
    }
}
