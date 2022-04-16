package com.company;

import java.util.Stack;

public class Tut_79_Infix_to_Prefix {

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

    public static String InfixToPrefix(String s){
        Stack<Character> st=new Stack<>();
        String res="";
        for (int i = s.length()-1; i >=0 ; i--) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                res+=s.charAt(i);
            }
            else if (s.charAt(i)==')'){
                st.push(s.charAt(i));
            }
            else if (s.charAt(i)=='('){
                while (!st.empty() && st.peek()!=')'){
                    res+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
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
        String s=InfixToPrefix("(a-b/c)*(a/k-l)");
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
