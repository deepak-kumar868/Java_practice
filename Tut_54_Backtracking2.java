package com.company;
import java.util.*;
public class Tut_54_Backtracking2<vector> {
    public static Vector<Vector<Integer>> ans;
    public static void permutate(Vector<Integer> a,int idx){
        if (idx==a.size()){
            ans.add(a);
            return;
        }
        for (int i = idx; i <a.size() ; i++) {
            Collections.swap(a,i,idx);
            permutate(a,idx+1);
            Collections.swap(a,i,idx);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of vector:");
        n=sc.nextInt();
        Vector<Integer> a=new Vector<>(n);
        for (int i = 0; i <n ; i++) {
            int x;
            x=sc.nextInt();
            a.add(x);
        }
        permutate(a,0);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.println(ans.elementAt(i));
        }
    }
}
