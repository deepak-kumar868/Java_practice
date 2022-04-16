package com.company;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_66_Linked_List {

    public static Node head=null;

    public static void Insert_at_Tail(int val){
        Node newnode=new Node(val);
        if (head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public static void display(){
        if (head==null){
            System.out.println("List is Empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public static void Insert_at_head(int val){
        Node newnode=new Node(val);
     if(head==null){
         head=newnode;
         return;
     }
     newnode.next=head;
     head=newnode;
    }

    public static boolean search(int val){
        Node temp=head;
        while (temp!=null){
            if (temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void delete(int val){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while (temp.next.data!=val){
            temp=temp.next;
        }
        Node todelete=temp.next;
        temp.next=temp.next.next;
    }

    public static void delete_at_head(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }

    public static void Reverse(){
        Node prev=null;
        Node curr=head;
        Node nextptr;

        if (head==null){
            System.out.println("List is Empty,Reverse is not possible");
            return;
        }
        while (curr!=null){
            nextptr=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextptr;
        }
        head=prev;
        return;
    }

//    public static Node ReverseK(Node head,int k){
//        if (head==null){
//            return null;
//        }
//        Node prevo=null;
//        Node currt=head;
//        Node nextpt=null;
//
//        int count=0;
//        while (count<k && currt!=null){
//            nextpt=currt.next;
//            currt.next=prevo;
//            prevo=currt;
//            currt=nextpt;
//            count++;
//        }
//        if (nextpt!=null){
//            head.next=ReverseK(nextpt,k);
//        }
//        return prevo;
//    }

    public static boolean detectcycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void makecycle(int pos){
        Node temp=head;
        Node start=null;
        int count=0;
        while (temp.next!=null){
            if (count==pos){
              start=temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=start;
    }

    public static void removecycle(){
        Node slow=head;
        Node fast=head;
        do {
            slow=slow.next;
            fast=fast.next.next;
        }
        while (slow !=fast);

        fast=head;
        while (slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=null;
    }

    public static void main(String[] args) {
        Insert_at_Tail(2);
        Insert_at_Tail(3);
        Insert_at_Tail(6);
        Insert_at_Tail(5);
        Insert_at_Tail(9);
        Insert_at_head(15);
        Insert_at_head(10);
        System.out.println(search(61));
        display();
//        ReverseK(head,2);
//        System.out.println("");
//        display();
//        delete(9);
        delete_at_head();
        System.out.println("");
        display();
        System.out.println("");
        Reverse();
        display();
        System.out.println("");
        System.out.println(detectcycle());
        makecycle(2);
        removecycle();
        display();
    }
}
