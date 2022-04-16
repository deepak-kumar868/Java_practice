package com.company;

import java.util.Stack;

public class Tut_78_Infix_to_Postfix {

    public static int prec(char c){
        if (c=='^'){
            return 3;
        }
        else if (c=='*' || c=='/'){
            return 2;
        }
        else if (c=='+' || c=='-'){
            return 1;
        }
        return -1;
    }

    public static String InfixToPostfix(String s){
        Stack<Character> st=new Stack<Character>();
        String res="";
        for (int i = 0; i <s.length() ; i++) {
            if ((s.charAt(i)>'a' && s.charAt(i)<'z') || (s.charAt(i)>'A' && s.charAt(i)<'z')){
                res+=s.charAt(i);
            }
            else if (s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if (s.charAt(i)==')'){
                while (!st.empty() && st.peek()!='('){
                    res+=st.peek();
                    st.pop();
                }
                while (!st.empty()){
                    st.pop();
                }
            }
            else {
                while (!st.empty() && (prec(st.peek())>prec(s.charAt(i)))){
                    res+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }
        while (!st.empty()){
            res+=st.peek();
            st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(InfixToPostfix("a+b*c-d/e"));
    }
}

