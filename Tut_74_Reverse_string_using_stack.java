package com.company;
import java.util.*;
public class Tut_74_Reverse_string_using_stack {
    public static void reverse(String s){
        Stack<String> st=new Stack<String>();
        for (int i = 0; i <s.length() ; i++) {
            String word="";
            while (i<s.length() && s.charAt(i)!=' '){
                word+=s.charAt(i);
                i++;
            }
            st.push(word);
        }

        while(!st.empty()){
            System.out.print(st.peek());
            st.pop();
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//      String s=sc.nextLine();
        String s="Hey! deepak kumar";
//      System.out.println(s.length());
      reverse(s);
    }
}
