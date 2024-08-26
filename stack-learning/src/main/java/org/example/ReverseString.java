package org.example;

import java.util.Stack;

public class ReverseString {
    public void reverse(){

    }

    public static void main(String[] args) {
        Stack<Character> stackUsingArray = new Stack<Character>();
        String abc = "abc";
        char[] arr = abc.toCharArray();
        for (char c : arr) {
            stackUsingArray.push(c);
        }
        char[] newArr = new char[arr.length];
        for (int i= 0;i<arr.length;i++ ){
            newArr[i]= stackUsingArray.pop();
        }
        System.out.println(new String(newArr));
    }
}
