package org.example;

public class StackUsingArray {
    int[] stackArray = new int[1000];
    int topIndex = -1;

    StackUsingArray() {
        topIndex = -1;
    }
    public boolean isEmpty(){
        return topIndex<0;
    }

    public void push(int data) {
        stackArray[++topIndex] = data;
    }

    public int pop() {
        int popped = stackArray[topIndex];
        stackArray[topIndex] = 0;
        --topIndex;
        return popped;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        System.out.println(stackUsingArray.stackArray);
    }
}
