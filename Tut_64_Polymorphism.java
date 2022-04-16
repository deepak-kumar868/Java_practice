package com.company;

public class Tut_64_Polymorphism {
    public static void fun(){
        System.out.println("Function with zero argument");
    }
    public static void fun(int x){
        System.out.println("Function with 2 argument");
    }
    public static void fun(int x,int y){
        System.out.println("Function with 3 argument");
    }
    public static void main(String[] args) {
        fun();
        fun(2);
        fun(4,6);
    }
}
