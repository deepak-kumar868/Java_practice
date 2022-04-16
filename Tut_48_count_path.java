package com.company;

public class Tut_48_count_path {
    public static int path(int s,int e){
        if(s==e){
            return 1;
        }
        if(s>e){
            return 0;
        }
        int count=0;
        for (int i = 1; i <=6 ; i++) {
            count+=path(s+i,e);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(path(0,4));
    }
}
