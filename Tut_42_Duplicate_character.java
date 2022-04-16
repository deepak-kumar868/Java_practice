package com.company;

public class Tut_42_Duplicate_character {
    public static String duplicate(String str){
        if(str.length()==1){
            return "";
        }
        String ans=duplicate(str.substring(1));
        if(str.charAt(0)==ans.charAt(0)){
            return ans;
        }
        else {
            return str.charAt(0)+ans;
        }
    }

    public static void main(String[] args) {
        duplicate("aaaabbbccccccccdddddeeef");
    }
}
