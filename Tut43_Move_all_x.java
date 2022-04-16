package com.company;

public class Tut43_Move_all_x {
    public static String Moveallx(String str){
        if(str.length()==0){
            return "";
        }
        String ans=Moveallx(str.substring(1));
        if(str.charAt(0)=='x'){
            return ans+str.charAt(0);
        }
        else {
            return str.charAt(0)+ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(Moveallx("ruxytxxgtxxjkfgxkx"));
    }
}
