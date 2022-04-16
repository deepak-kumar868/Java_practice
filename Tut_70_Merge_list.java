package com.company;

class Node3{
    int data;
    Node3 next;

    Node3(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_70_Merge_list {

    public static int length(Node3 head){
        Node3 temp=head;
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

    public static void display(Node3 head){
        if (head==null){
            System.out.println("List is Empty");
        }
        Node3 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public static Node3 merge(Node3 head1,Node3 head2){
        Node3 temp1=head1;
        Node3 temp2=head2;
        Node3 dummy=null;
        Node3 head=null;
        if (temp1.data>=temp2.data){
            dummy=temp2;
            temp2=temp2.next;
        }
        else{
            dummy=temp1;
            temp1=temp1.next;
        }
        head=dummy;
        while (temp1!=null && temp2!=null){
            if ( temp1.data>=temp2.data){
                dummy.next=temp2;
                temp2=temp2.next;
            }
            else {
                dummy.next=temp1;
                temp1=temp1.next;
            }
            dummy=dummy.next;
        }
        if (temp1!=null && temp2==null){
            while (temp1!=null){
                dummy.next=temp1;
                temp1= temp1.next;
            }
        }
        else if(temp1==null && temp2!=null){
            while (temp2!=null){
                dummy.next=temp2;
                temp2=temp2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node3 head1= new Node3(1);
        head1.next = new Node3(2);
        head1.next.next = new Node3(4);
        head1.next.next.next = new Node3(5);
        head1.next.next.next.next = new Node3(9);

        Node3 head2 = new Node3(3);
        head2.next = new Node3(7);
        head2.next.next = new Node3(8);

        Node3 head= merge(head1,head2);
        display(head);
    }
}
