package com.company;
import java.util.*;
class Tut65{
    public void func(){
        System.out.println("This is function of parent class");
    }
}

class child extends Tut65{
    @Override
    public void func(){
        System.out.println("This is function of child class");
    }
}

public class Tut_65_RunTime_Polymorphism {
    public static void main(String[] args) {
        Tut65 t=new Tut65();
        Tut65 t1=new child();
        child c1=new child();
        c1.func();
        t1.func();
        t.func();
    }
}
