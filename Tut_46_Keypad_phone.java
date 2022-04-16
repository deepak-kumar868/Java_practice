package com.company;

public class Tut_46_Keypad_phone {
    public static void keypad(String str,String ans){
        String []arr=new String[]{"","","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
                if(str.length()==0){
                    System.out.println(ans);
                    return;
                }
                char ch=str.charAt(0);
                String res=str.substring(1);
        for (int i = 0; i <res.length() ; i++) {

        }
    }
}
