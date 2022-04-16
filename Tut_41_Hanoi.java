package com.company;

public class Tut_41_Hanoi {
    public static void hanoi(int n,char scr,char des,char helper){
        if(n==0){
            return;
        }
        hanoi(n-1,scr,helper,des);
        System.out.println("Move from "+scr+" to "+ des);
        hanoi(n-1,helper,scr,des);
    }

    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }
}
