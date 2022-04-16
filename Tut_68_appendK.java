package com.company;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_68_appendK {

    public static Node1 head=null;

    public static int length(){
        Node1 temp=head;
        if (temp==null){
            return 0;
        }
        int l=0;
        while (temp!=null){
            l++;
            temp=temp.next;
        }
        return l;
    }

    public static void Insert_at_Tail(int val){
        Node1 newnode=new Node1(val);
        if (head==null){
            head=newnode;
            return;
        }
        Node1 temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public static void display(){
        if (head==null){
            System.out.println("List is Empty");
        }
        Node1 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public static void Insert_at_head(int val){
        Node1 newnode=new Node1(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public static void appendK(int k)
    {
        int n = length() - k;
        Node1 temp = head;
        Node1 temp1 = head;
        while (temp1.next != null)
        {
            temp1 = temp1.next;
        }

        int i = 1;
        while (i < n)
        {
            temp = temp.next;
            i++;
        }
        temp1.next = head;
        head = temp.next;
        temp.next = null;
    }

    public static void main(String[] args) {
        Insert_at_Tail(2);
        Insert_at_Tail(3);
        Insert_at_Tail(6);
        Insert_at_Tail(5);
        Insert_at_Tail(9);
        Insert_at_head(15);
        Insert_at_head(10);
        display();
        appendK(3);
        System.out.println("");
        display();
    }
}
