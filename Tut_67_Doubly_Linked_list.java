package com.company;

class Nodes{
    int data;
    Nodes prev;
    Nodes next;

    Nodes(int data){
        this.data=data;
        this.prev= null;
        this.next=null;
    }
}

public class Tut_67_Doubly_Linked_list {
    public static Nodes head=null;
    public static void Insertion_at_Tail(int val){
        Nodes newnode=new Nodes(val);
        if (head==null){
            head=newnode;
            return;
        }
        Nodes temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }

    public static void Insertion_at_head(int val){
        Nodes newnode=new Nodes(val);
        if (head==null){
            head=newnode;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
    }

    public static void display(){
        Nodes temp=head;
        if (temp==null){
            System.out.println("This Doubly list is empty");
            return;
        }
        System.out.print("null->");
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static int length(){
        Nodes temp=head;
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

    public static void main(String[] args) {
        Insertion_at_head(6);
     Insertion_at_Tail(1);
     Insertion_at_Tail(2);
     Insertion_at_Tail(3);
     Insertion_at_Tail(4);
     Insertion_at_Tail(5);
     display();
     System.out.println("");
     System.out.println(length());
     System.out.println("");
     display();
    }
}
