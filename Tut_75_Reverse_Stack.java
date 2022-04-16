package com.company;

import java.util.Stack;

public class Tut_75_Reverse_Stack {

    public static void InsertionatButton(int val,Stack<Integer> st){
        if (st.empty()){
            st.push(val);
            return;
        }
        int topl=st.peek();
        st.pop();
        InsertionatButton(val,st);
        st.push(topl);
    }

    public static void ReverseStack(Stack<Integer> st){
        if (st.empty()){
            return;
        }
        int top=st.peek();
        st.pop();
        ReverseStack(st);
        InsertionatButton(top,st);
    }
    public static void main(String[] args) {
     Stack<Integer> st=new Stack<>();
     st.push(1);
     st.push(2);
     st.push(3);
     st.push(4);
     st.push(5);
     ReverseStack(st);
     while (!st.empty()){
         System.out.print(st.peek()+" ");
         st.pop();
     }
    }
}
