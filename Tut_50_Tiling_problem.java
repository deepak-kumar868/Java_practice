package com.company;

public class Tut_50_Tiling_problem {
    public static int Tiling(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Tiling(n-1)+Tiling(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Tiling(4));
    }
}
