package org.example;

import java.util.List;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode {
        private int val;
        private ListNode next;
        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public SinglyLinkedList getSLL(int[] array){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        ListNode prevNode = null;
        for(int i=0;i<array.length;i++)
        {
            if(i==0){
                singlyLinkedList.head = new ListNode(array[i]);
                prevNode = singlyLinkedList.head;
            }else{
                ListNode nextNode = new ListNode(array[i]);
                prevNode.next = nextNode;
                prevNode = nextNode;
            }
        }
        return singlyLinkedList;
    }

    public void printElements(){
        ListNode current = head;
        while(current.next!=null){
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }

    public int length(){
        int count = 0;
        ListNode current = head;
        while(current.next!=null){
            count ++;
            current = current.next;
        }
        count++;
        System.out.println("Length of LL is: "+count);
        return count;
    }

    public void insertAtPosition(int position,int newData){
        int count = 0;
        ListNode current = head;
        ListNode prev = null;
        ListNode newNode = new ListNode(newData);

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
        ListNode current = head;
        ListNode prev = null;

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
        ListNode current = head;
        while(current.next!=null){
            if(dataToSearch == current.val){
                System.out.println("found");
                break;
            }
            current = current.next;
        }
        if(dataToSearch == current.val){
            System.out.println("found");
        }
        else{
            System.out.println("not found");

        }

    }

    public void reverse(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
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

    private void findMid(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer!=null && slowPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println( slowPointer.val);

    }

    private void findNth(int n){
        ListNode fastPointer = head;
        int count =1;
        while(n!=count){
            fastPointer= fastPointer.next;
            count++;
        }
        System.out.println(fastPointer.val);
    }

    private void findNthFromEnd(int n){
        int len = this.length();
        ListNode pointer = head;
        int i=1;
        while(i<len-(n-1))
        {
            pointer = pointer.next;
            i++;
        }
        System.out.println(pointer.val);

    }

    private void removeDuplicate(){
        ListNode pointer = head;
        while(pointer.next!=null){
            if(pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        printElements();

    }

    private boolean detectLoopFloyd(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer!=null && slowPointer!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer==fastPointer){
                return true;
            }
        }
        return false;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp=null;
        if(list1==null && list2==null)
        {
            return null;
        }
        if(list1==null)
        {
            return list2;
        }
        if( list2==null)
        {
            return list1;
        }

        if(list1.val <= list2.val){
            head = new ListNode(list1.val);
            list1 = list1.next;

        }
        else if(list2.val <= list1.val){
            head = new ListNode(list2.val);
            list2 = list2.next;
        }
        temp = head;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = new ListNode(list1.val);
                temp.next.next = new ListNode(list2.val);
                list1 = list1.next;

            }
            else if(list2.val <= list1.val){
                temp.next = new ListNode(list2.val);
                temp.next.next = new ListNode(list1.val);
                list2 = list2.next;

            }
            temp = temp.next;
        }
        while(list1!=null){
            temp.next = new ListNode(list1.val);
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2!=null){
            temp.next =new ListNode(list2.val);
            temp = temp.next;
            list2 = list2.next;
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry =0;
        while(l1!=null || l2!=null){
            int sum = (l1!=null?l1.val:0)+(l2!=null?l2.val:0) +carry;
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            carry = sum/10%10;
            if(l1!=null){l1=l1.next;};
            if(l2!=null){l2=l2.next;};
        }
        if(carry>0){
            dummy.next = new ListNode(carry);
        }
        return head.next;

    }
    public static void main(String[] args) {
       SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList().getSLL(new int[]{2,4,3});
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList().getSLL(new int[]{5,6,4});
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
//        singlyLinkedList.findMid();
//        singlyLinkedList.findNth(3);
//        singlyLinkedList.findNthFromEnd(3);
//        singlyLinkedList.removeDuplicate();
        singlyLinkedList1.addTwoNumbers(singlyLinkedList1.head,singlyLinkedList2.head);


    }
}
