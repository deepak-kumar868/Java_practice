package com.company;

public class Tut_49_maze {
    public static int maze(int n,int i,int j){
        if (i==n-1 && j==n-1){
            return 1;
        }
        if (i>n-1 || j>n-1){
            return 0;
        }
        return maze(n,i+1,j)+maze(n,i,j+1);
    }

    public static void main(String[] args) {
        System.out.println(maze(3,0,0));
    }
}
