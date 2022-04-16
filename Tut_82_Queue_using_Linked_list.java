package com.company;

class Node6{
    int data;
    Node6 next;

    Node6(int val){
        data=val;
        this.next=null;
    }
}

class Queues{
    Node6 front;
    Node6 back;
    Queues(){
        front=null;
        back=null;
    }

    void enqueue(int val){
        Node6 newnode=new Node6(val);
        if (front==null && back==null){
            front=newnode;
            back=newnode;
            return;
        }
        back.next=newnode;
        back=back.next;
    }

    void dequeue(){
        if (front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node6 temp=front;
        front=front.next;
    }
    void peek(){
        if (front==null){
            System.out.println("No element in queue");
            return;
        }
        System.out.println(front.data);
        return;
    }
}

public class Tut_82_Queue_using_Linked_list {
    public static void main(String[] args) {
       Queues q=new Queues();
       q.enqueue(2);
       q.enqueue(5);
       q.enqueue(3);
       q.enqueue(8);
       q.peek();
       q.dequeue();
       q.peek();
    }
}
