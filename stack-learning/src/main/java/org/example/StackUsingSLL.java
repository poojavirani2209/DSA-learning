package org.example;

public class StackUsingSLL {// same as adding elements at 0th position
    private Node head =null;
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    StackUsingSLL(){

    }

    public void push(int data){
        if(head ==null){
            head = new Node(data);
        }
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        System.out.println(head.data);
        head = head.next;
    }

    public static void main(String[] args) {
        StackUsingSLL stackUsingSLL = new StackUsingSLL();
        stackUsingSLL.push(2);
        stackUsingSLL.push(3)
        ;
        stackUsingSLL.pop();
        stackUsingSLL.pop();
    }
}


