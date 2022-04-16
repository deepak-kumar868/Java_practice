package com.company;
import java.util.*;
class student{
    int id;
    boolean gender;
    private String name;

    student(student a){
        System.out.println("copy constructor");
        name=a.name;
        id=a.id;
        gender=a.gender;
    }

    student(){
        System.out.println("Default constructor");
    }//Default constructor

    student(String s,int id,boolean gender){
        name=s;
        this.id=id;
        this.gender=gender;
    }//Paramaterised Constructor

    void printInfo(){
        System.out.println("Name="+name);
        System.out.println("Id="+id);
        System.out.println("Gender="+gender);
    }

    void setName(String s){  //setter function
        name=s;
    }

    void getName(){
        System.out.println(name);
    }
}
public class Tut_63_OOP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        student[]arr=new student[3];
//        for (int i = 0; i <3 ; i++) {
//            String str;
//            arr[i]=new student();
//            System.out.print("Name=");
//            str=sc.next();
//            arr[i].setName(str);
//            System.out.print("id=");
//            arr[i].id = sc.nextInt();
//            System.out.print("gender=");
//            arr[i].gender = sc.nextBoolean();
//        }
//        for (int i = 0; i <3 ; i++) {
//            arr[i].printInfo();
//        }

        student s=new student("Deepak",4,true);
        s.getName();
        s.printInfo();

        student s1=new student();
        student s2=new student();   //Make deep copy
        s2=s;//Default copy constructor  //Make shallow copy
        s2.printInfo();

        if (s==s2){
            System.out.println("Equal");
        }
        else {
            System.out.println("Unequal");
        }
    }
}
