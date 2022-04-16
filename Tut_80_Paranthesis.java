package com.company;

import java.util.Stack;

public class Tut_80_Paranthesis {
    public static boolean paran(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (!st.empty() && ((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='{' && s.charAt(i)=='}') || (st.peek()=='[' && s.charAt(i)==']'))){
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }
        if (!st.empty()){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
       boolean bool=paran("[{()}]");
       System.out.println(bool);
    }
}
