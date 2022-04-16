package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Tut_77_Postfix_Evaluation {
    public static int Postfix(String s){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push(s.charAt(i)-'0');
            }
            else {
                int op2=st.peek();
                st.pop();
                int op1=st.peek();
                st.pop();

                switch (s.charAt(i)) {
                    case '+':
                        st.push(op1 + op2);
                        break;
                    case '-':
                        st.push(op1 - op2);
                        break;
                    case '*':
                        st.push(op1 * op2);
                        break;
                    case '/':
                        st.push(op1 / op2);
                        break;
                    case '^':
                        st.push(op1 ^ op2);
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
        System.out.println("Enter Postfix string:");
        String s1=sc.next();
        System.out.println("The value of these Postfix sentence is:");
        System.out.println(Postfix(s1));
    }
}
