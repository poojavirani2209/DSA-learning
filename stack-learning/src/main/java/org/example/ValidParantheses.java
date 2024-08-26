package org.example;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        char top;
        String abc = "({)";
        char[] arr = abc.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{')
                stack.push(c);
            else {
                top = stack.peek();
                if (stack.isEmpty()) {
                    System.out.println("false");
                    break;
                } else if ((c == ')' && top == '(') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    System.out.println("false");
                    break;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
