package com.company;

import java.util.Scanner;

public class Tut23_Matrix_Multiplication{
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both Matrix");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        int [][]matrix1=new int[n1][n2];
        int [][]matrix2=new int[n2][n3];
        System.out.println("Enter the element of first Matrix");
        for (int i = 0; i <n1 ; i++) {
            for(int j=0;j<n2;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element of second Matrix");
        for (int i = 0; i <n2 ; i++) {
            for(int j=0;j<n3;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        int [][]ans=new int[n1][n3];
        for (int i = 0; i <n1 ; i++) {
            for(int j=0;j<n3;j++){
                ans[i][j]=0;
            }
        }

        for (int i = 0; i <n1 ; i++) {
            for(int j=0;j<n3;j++){
                for(int k=0;k<n2;k++){
                    ans[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        System.out.println("The result of multiplication of matrix is:");
        for (int i = 0; i <n1 ; i++) {
            for(int j=0;j<n3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

