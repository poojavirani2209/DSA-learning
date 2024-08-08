package org.example;

public class DoublyLinkedList {
    Node head=null;

    private class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    DoublyLinkedList(int[] arr){
        Node current = null;
        Node prevNode = null;
        for(int i=0;i<arr.length;i++){
            if(head == null){
                head= new Node(arr[i]);
                current = head;
                prevNode = head;
            }else {
                Node node = new Node(arr[i]);
                current.next = node;
                node.previous = prevNode;
                current = current.next;
                prevNode = node;
            }
        }
    }

    private void print(){
        Node dummy = head;
        while(dummy!=null){
            System.out.println(dummy.data);
            dummy = dummy.next;
        }
    }
    private void insertAtPosition(int position, int data){
        int count = 0;
        Node current = head;
        Node newNode = new Node(data);
        if(position == 0){
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        else{
            while(count!=position){
                current = current.next;
                count++;
            }
            newNode.previous = current.previous;
            current.previous.next = newNode;
            newNode.next = current;
            current.previous = newNode;
        }

    this.print();
    }

    private void deleteAtPosition(int position){
        int count = 0;
        Node current = head;
        if(position == 0){
            head = head.next;
            head.previous = null;
        }
        else{
            while(count!=position){
                current = current.next;
                count++;
            }
            if(current.next==null){
                current.previous.next = null;
            }
            else {
                current.next.previous = current.previous;
                current.previous.next = current.next;
            }
        }

        this.print();
    }

    public static void main(String args[]){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(new int[]{1,2,3});
//        doublyLinkedList.insertAtPosition(0,4);
//        doublyLinkedList.insertAtPosition(1,4);
//        doublyLinkedList.deleteAtPosition(0);
//        doublyLinkedList.deleteAtPosition(1);
        doublyLinkedList.deleteAtPosition(2);
    }

}
