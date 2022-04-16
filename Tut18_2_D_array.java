package com.company;
import java.util.Scanner;
public class Tut18_2_D_array {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of column and no. of row in matrix");
        m=sc.nextInt();
        n=sc.nextInt();

        int [][]arr=new int[m][n];
        System.out.println("Enter the element of matrix");
        for (int i = 0; i <m ; i++) {
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for (int i = 0; i <m ; i++) {
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
