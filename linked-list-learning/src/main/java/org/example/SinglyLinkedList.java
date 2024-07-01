package org.example;

public class SinglyLinkedList {
    private Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList getSLL(int[] array){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node prevNode = null;
        for(int i=0;i<array.length;i++)
        {
            if(i==0){
                singlyLinkedList.head = new Node(array[i]);
                prevNode = singlyLinkedList.head;
            }else{
                Node nextNode = new Node(array[i]);
                prevNode.next = nextNode;
                prevNode = nextNode;
            }
        }
        return singlyLinkedList;
    }

    public void printElements(){
        Node current = head;
        while(current.next!=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void length(){
        int count = 0;
        Node current = head;
        while(current.next!=null){
            count ++;
            current = current.next;
        }
        count++;
        System.out.println("Length of LL is: "+count);
    }

    public void insertAtPosition(int position,int newData){
        int count = 0;
        Node current = head;
        Node prev = null;
        Node newNode = new Node(newData);

        while(current.next!=null) {
            if (position == 0) {
                newNode.next = head;
                head = newNode;
                break;
            } else {
                if(position == count){
                    prev.next = newNode;
                    newNode.next = current;
                    current = newNode;
                }
            }
            count++;
            prev=current;
            current = current.next;
        }
        if(position ==-1)
        {
            current.next =newNode;
        }

        System.out.println("New LL:");
        printElements();
    }

    public void deleteFromPosition(int position){
        int count = 0;
        Node current = head;
        Node prev = null;

        while(current.next!=null) {
            if (position == 0) {
                head = head.next;
                break;
            } else {
                if(position==count){
                    prev.next =current.next;
                }
            }
            count++;
            prev=current;
            current = current.next;
        }
        if(position ==-1)
        {
    prev.next=null;
        }

        System.out.println("New LL:");
        printElements();
    }

    public void searchElement(int dataToSearch){
        Node current = head;
        while(current.next!=null){
            if(dataToSearch == current.data){
                System.out.println("found");
                break;
            }
            current = current.next;
        }
        if(dataToSearch == current.data){
            System.out.println("found");
        }
        else{
            System.out.println("not found");

        }

    }

    public void reverse(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current.next!=null){
            next = current.next;
            if(current == head){
                current.next = null;
            }else{
                current.next = prev;
            }
            prev =current;
            current = next;
        }
        next = current.next;
        current.next = prev;
        head = current;
        printElements();
    }

    public static void main(String[] args) {
       SinglyLinkedList singlyLinkedList = new SinglyLinkedList().getSLL(new int[]{1,2,3});
//       singlyLinkedList.printElements();
//       singlyLinkedList.length();
//       singlyLinkedList.insertAtPosition(0,4);
//       singlyLinkedList.insertAtPosition(-1,5);
//       singlyLinkedList.insertAtPosition(1,6);
//        singlyLinkedList.searchElement(3);
//        singlyLinkedList.searchElement(7);
//        singlyLinkedList.deleteFromPosition(0);
//        singlyLinkedList.deleteFromPosition(-1);
//        singlyLinkedList.deleteFromPosition(1);
//        singlyLinkedList.reverse();

    }
}
