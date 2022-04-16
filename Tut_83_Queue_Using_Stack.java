package com.company;

import java.util.Stack;

class queue1 {
     public static Stack<Integer> st1 = new Stack<>();
     public static Stack<Integer> st2 = new Stack<>();

    public static void enqueue(int val) {
        if (st2.empty()) {
            st1.push(val);
            return;
        }
        while (!st2.empty()) {
            st1.push(st2.peek());
            st2.pop();
        }
        st1.push(val);
    }

    public static void dequeue() {
        if (st1.empty() && st2.empty()) {
            System.out.println("Queue is empty");
            return;
        } else if (st1.empty() && !st2.empty()) {
            st2.pop();
            return;
        } else if (!st1.empty()) {
            while (!st1.empty()) {
                st2.push(st1.peek());
                st1.pop();
            }
            return;
        }
    }

    public static void peek() {
        if(st1.empty() && st2.empty()) {
            System.out.println("Queue is empty");
            return;
        }
        else if (st1.empty() && !st2.empty()) {
            System.out.println(st2.peek());
            return;
        } else if (!st1.empty()) {
            while (!st1.empty()) {
                st2.push(st1.peek());
                st1.pop();
            }
            System.out.println(st2.peek());
            return;
        }
    }
}

public class Tut_83_Queue_Using_Stack {
public static void main(String[] args) {
    queue1 q1=new queue1();
    q1.enqueue(2);
    q1.enqueue(3);
    q1.enqueue(6);
    q1.peek();
    q1.dequeue();
    q1.peek();
}
}
