package com.company;

class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

public class Tut_69_Intersection {
    public static int length(Node2 head){
        Node2 temp=head;
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

    public static int intersection(Node2 head1,Node2 head2){
        Node2 temp1=head1;
        Node2 temp2=head2;
        int l1=length(head1);
        int l2=length(head2);
        if (l1>=l2){
            int n=l1-l2;
            int i=0;
            while(i<n){
                temp1=temp1.next;
                i++;
            }
        }
        else if (l1<l2){
            int n=l2-l1;
            int i=0;
            while(i<n){
                temp2=temp2.next;
                i++;
            }
        }

        while (temp1.next!=null && temp2.next!=null && temp1.data!=temp2.data){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if (temp1.data==temp2.data){
            return temp1.data;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node2 head1=new Node2(1);
        head1.next=new Node2(2);
        head1.next.next=new Node2(3);
        head1.next.next.next=new Node2(4);
        head1.next.next.next.next=new Node2(5);

        Node2 head2=new Node2(6);
        head2.next=new Node2(7);
        head2.next.next=new Node2(8);
        head2.next.next.next=head1.next.next;
        if (intersection(head1,head2)==0){
            System.out.println("There is no any Intersection point");
        }
        else {
            System.out.println("Common point is:"+intersection(head1,head2));
        }
    }
}
