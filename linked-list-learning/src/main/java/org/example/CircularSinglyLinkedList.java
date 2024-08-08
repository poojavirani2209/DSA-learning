package org.example;

public class CircularSinglyLinkedList {
    Node head;
    private class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    CircularSinglyLinkedList(int[] arr){
        Node prevNode = null;
        for(int i=1;i<=arr.length;i++){
            if(head == null){
                head = new Node(arr[i-1]);
                prevNode = head;
            }

            else {
                Node node = new Node(arr[i-1]);
                prevNode.next = node;
                prevNode = node;
                if(i==arr.length){
                    node.next = head;
                }
            }

        }
    }

    private void insertAtPosition(int position, int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        int count = 1;

        if(position ==0){
            newNode.next = head;
            while(currentNode.next!=head){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            head = newNode;
        }
        else{
            Node current = head;
            while(count<position){
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    private void deleteAtPosition(int position){
        Node currentNode = head;
        int count = 1;

        if(position ==0){
            while(currentNode.next!=head){
                currentNode = currentNode.next;
            }
            currentNode.next = head.next;
            head = head.next;
        }
        else{
            Node current = head;
            while(count<position){
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
    }
    public static void main(String[] args){
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList(new int[]{1,2,3});
//        circularSinglyLinkedList.insertAtPosition(0,4);

//        circularSinglyLinkedList.insertAtPosition(1,4);
//        circularSinglyLinkedList.insertAtPosition(3,4);
//        circularSinglyLinkedList.deleteAtPosition(0);
//        circularSinglyLinkedList.deleteAtPosition(1);
//        circularSinglyLinkedList.deleteAtPosition(2);

        System.out.println();

    }
}
