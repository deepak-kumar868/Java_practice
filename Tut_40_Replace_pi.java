package com.company;

public class Tut_40_Replace_pi {
    public static void replace(String str){
        if (str.length()==0){
            return;
        }
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            System.out.print("3.14");
            replace(str.substring(2));
        }
        else{
            System.out.print (str.charAt(0));
            replace(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str="piippippiiipipii";
        replace(str);
    }
}
