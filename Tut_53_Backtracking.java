package com.company;

import java.util.Scanner;

public class Tut_53_Backtracking {
      public static boolean issafe(int [][]arr,int x,int y,int n){
          if(x<n && y<n && arr[x][y]==1){
              return true;
          }
          return false;
      }

      public static boolean rateMaze(int[][]arr,int x,int y,int n,int[][]sol) {
          if (x == n - 1 && y == n - 1) {
              arr[x][y] = 1;
              return true;
          }
          if (issafe(arr, x, y, n)) {
              sol[x][y] = 1;
              if (rateMaze(arr, x + 1, y, n, sol)) {
                  return true;
              }
              if (rateMaze(arr, x, y + 1, n, sol)) {
                  return true;
              }
              sol[x][y] = 0;  //Backtracking
              return false;
          }
          return false;
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int [][]arr=new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int [][]sol=new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                sol[i][j]=0;
            }
        }
        if(rateMaze(arr,0,0,4,sol)){
            for (int i = 0; i <4 ; i++) {
                for (int j = 0; j <4 ; j++) {
                    System.out.print(sol[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
