package com.company;

public class Tut_45_Subseq2 {
    public static void subseq2(String str,String ans){
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String res=str.substring(1);
        subseq2(res,ans);
        subseq2(res,ans+ch);
        subseq2(res,ans+(int)ch);
    }

    public static void main(String[] args) {
        subseq2("AB","");
    }
}
