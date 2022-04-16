package com.company;

class Node4{
    int data;
    Node4 next;

    Node4(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_71_Circular_linked_list {
    public static Node4 head=null;
    public static void insertion(int val){
        Node4 newnode=new Node4(val);
        if (head==null){
            head=newnode;
            head.next=head;
            return;
        }
        Node4 temp=head;
        if (head.next==head) {
            head.next = newnode;
            newnode.next = head;
            return;
        }
        else{
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
        }
    }

    public static void display(){
        Node4 temp=head.next;
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.print(head.data+"->");
        while (temp.next!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(head.data);
    }

    public static void main(String[] args) {
        insertion(1);
        insertion(2);
        insertion(3);
        insertion(4);
        insertion(5);
        display();
    }
}
