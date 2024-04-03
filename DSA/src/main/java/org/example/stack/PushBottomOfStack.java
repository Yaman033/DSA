package org.example.stack;

import java.util.Stack;

public class PushBottomOfStack {

    public static void pushBottom(int ele, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(ele);
            return;
        }
        Integer top = s.pop();
        pushBottom(ele, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(top, s);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("After Reverse-> ");

    }
}
