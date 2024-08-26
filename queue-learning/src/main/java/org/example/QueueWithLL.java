package org.example;

public class QueueWithLL {
    Node rear;
    Node front;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
        if(front == null && rear == null){
            front = new Node(data);
            rear = front;
        }
        else{
            Node temp = new Node(data);
            rear.next = temp;
            rear = temp;
        }

    }
    public void pop(){
        if(front==null){
            System.out.println("empty");
        }
        else{
            System.out.println(front.data);
            front = front.next;
        }

    }
    public static void main(String[] args) {
        QueueWithLL queueWithLL = new QueueWithLL();
        queueWithLL.push(1);
        queueWithLL.push(2);
        queueWithLL.push(3);

        queueWithLL.pop();
        queueWithLL.pop();
        queueWithLL.pop();
        queueWithLL.pop();

    }

}
