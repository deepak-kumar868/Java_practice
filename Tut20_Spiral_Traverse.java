package com.company;
import java.util.Scanner;
public class Tut20_Spiral_Traverse {
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
        System.out.println("Spiral traverse of Matrix is:");
        int row_start=0;
        int col_start=0;
        int row_end=m-1;
        int col_end=n-1;

        while(row_start<=row_end && col_start<=col_end){
            for (int i = col_start; i <=col_end ; i++) {
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;

            for (int i = row_start; i <=row_end ; i++) {
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;

            for (int i = col_end; i >=col_start ; i--) {
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;

            for (int i = row_end; i >=row_start ; i--) {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}
