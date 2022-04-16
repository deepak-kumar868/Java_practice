package com.company;

class Node5{
    int data;
    Node5 next;

    Node5(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_72_Put_Even {
    public static void Even_Odd(Node5 head) {
        Node5 odd = head;
        Node5 even = head.next;
        Node5 evenstart = even;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next=evenstart;
    }
        public static void display(Node5 head){
            Node5 temp=head;
            if (head==null) {
                System.out.println("List is empty");
                return;
            }
            while (temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
    }
    public static void main(String[] args) {
        Node5 head=new Node5(1);
        head.next=new Node5(2);
        head.next.next=new Node5(3);
        head.next.next.next=new Node5(4);
        head.next.next.next.next=new Node5(5);
        Even_Odd(head);
        display(head);
    }
}
