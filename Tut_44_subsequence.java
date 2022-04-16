package com.company;

public class Tut_44_subsequence {
    public static void subsq(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String res=str.substring(1);
        subsq(res,ans);
        subsq(res,ans+ch);
    }

    public static void main(String[] args) {
        subsq("ABC","");
    }
}
