package com.company;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Tut_85_Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<Integer>();
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.addLast(5);
        System.out.println(dq.peekFirst());

    }
}
