package com.company;

import java.util.*;
import java.util.Iterator;
import java.util.Vector;

public class Tut_58_Vector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);

        Iterator it=v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(v);
        int mx=Collections.max(v);
        System.out.println(mx);
        int mn=Collections.min(v);
        System.out.println(mn);
    }
}
