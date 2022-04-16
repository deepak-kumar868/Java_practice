package com.company;

class stacks{
    int top;
    int []arr;
    int n;

    stacks(int n){
        this.top=-1;
        this.n=n;
        arr=new int[n];
    }

    void push(int val){
        if (top==n-1){
            System.out.println("Stack is empty");
            return;
        }
        arr[top+1]=val;
        top++;
    }

    void pop(){
        if (top==-1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
    int top(){
        if (top==-1){
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    boolean empty(){
        if (top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
}

public class Tut_73_Stack {
    public static void main(String[] args) {
        stacks st=new stacks(6);
        st.push(34);
        st.push(23);
        st.push(87);
        st.push(56);
        System.out.println(st.top());
        st.pop();
        st.pop();
        System.out.println(st.top());
        st.pop();
        st.pop();
        System.out.println(st.top());
        System.out.println(st.empty());
    }
}
