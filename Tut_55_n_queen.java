package com.company;

import java.util.Scanner;

public class Tut_55_n_queen {

    public static boolean issafe(int [][]arr,int x,int y,int n){
        for (int row = 0; row <x ; row++) {
            if (arr[row][y]==1){
                return false;
            }
        }
        int row=x;
        int col=y;

        while (row>=0 && col>=0){
            if (arr[row][col]==1){
                return false;
            }
            row--;
            col--;
        }

        row=x;
        col=y;
        while (row>=0 && col<n){
            if (arr[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }

    public static boolean queen(int [][]arr,int x,int n){
        if (x>=n){
            return true;
        }
        for (int col = 0; col <n ; col++) {
            if (issafe(arr,x,col,n)){
                arr[x][col]=1;
                if (queen(arr,x+1,n)){
                    return true;
                }
                arr[x][col]=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                arr[i][j]=0;
            }
        }
        if(queen(arr,0,4)) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
