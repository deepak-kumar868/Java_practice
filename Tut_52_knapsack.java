package com.company;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
public class Tut_52_knapsack {
    public static int knapsack(int []value,int[]wt,int n,int cap){
        if(n==0 || cap==0){
            return 0;
        }
        if (wt[n-1]>cap){
            return knapsack(value,wt,n-1,cap);
        }
        return Math.max(knapsack(value,wt,n-1,cap-wt[n-1])+value[n-1],knapsack(value,wt,n-1,cap));
    }

    public static void main(String[] args) {
        int []wt=new int[]{10,20,30};
        int []value=new int[]{100,50,150};
        System.out.println(knapsack(value,wt,3,50));
    }
}
