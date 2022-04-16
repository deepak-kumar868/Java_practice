package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Tut_76_Prefix_Evaluation {

    public static int Prefix(String s){
        Stack<Integer> st=new Stack<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)>='0'&& s.charAt(i)<='9'){
                st.push(s.charAt(i)-'0');
            }
            else {
                int op1=st.peek();
                st.pop();
                int op2=st.peek();
                st.pop();
                switch (s.charAt(i)){
                    case '+':
                        st.push(op1+op2);
                        break;
                    case '-':
                        st.push(op1-op2);
                        break;
                    case '*':
                        st.push(op1*op2);
                        break;
                    case '/':
                        st.push(op1/op2);
                        break;
                    case '^':
                        st.push(op1^op2);
                        break;
                    default:
                        break;
                }
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter prefix string:");
        String s=sc.next();
        System.out.println("The value of these prefix sentence is:");
        System.out.println(Prefix(s));
    }
}
