package com.company;

class queue{
    int n;
    int []arr;
    int front;
    int back;

    queue(int n){
        this.n=n;
        arr=new int[n];
        front=-1;
        back=-1;
    }

    void enqueue(int val){
        if (front==-1  && back==-1){
            front++;
            back++;
            arr[back]=val;
            return;
        }
        else if (back==n-1){
            System.out.println("Overflow condition");
            return;
        }
        back++;
        arr[back]=val;
    }
    void dequeue(){
     if (front==-1 && front>=back){
         System.out.println("Underflow condition");
         return;
     }
     front++;
    }

    void peek(){
        if (front==-1 && front>=back){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front]);
    }
}

public class Tut_81_Queue {

    public static void main(String[] args) {
      queue q=new queue(5);
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);
      q.peek();
      q.dequeue();
      q.peek();
    }
}
