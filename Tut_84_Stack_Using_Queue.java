package com.company;
import java.util.*;
class Stack1{
    int top;
    Queue<Integer> q1=new LinkedList<Integer>();
    Queue<Integer> q2=new LinkedList<Integer>();

    Stack1(){
        top=-1;
    }

    void push(int val){
        q1.add(val);
        top++;
    }
    void pop() {
        if (q1.size() == 1) {
            q1.remove();
            top--;
            return;
        }
        else if (q1.size() == 0) {
            System.out.println("Stack is empty");
            return;
        }
        else {
            while (q1.size()!=1) {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.remove();
            top--;
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void topelement(){
        if (q1.size() == 1) {
            System.out.println(q1.peek());
            return;
        }
        else if (q1.size() == 0) {
            System.out.println("Stack is empty");
            return;
        }
        else {
            while (q1.size()!=1) {
                q2.add(q1.peek());
                q1.remove();
            }
            System.out.println(q1.peek());
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}

public class Tut_84_Stack_Using_Queue {
    public static void main(String[] args) {
       Stack1 st=new Stack1();
       st.push(3);
       st.push(4);
       st.push(8);
       st.push(9);
       st.topelement();
       st.pop();
       st.pop();
       st.topelement();
    }
}
