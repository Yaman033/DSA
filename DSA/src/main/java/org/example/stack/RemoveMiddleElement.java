package org.example.stack;

import java.util.Stack;

public class RemoveMiddleElement {

    public static void removeMiddleElement(Stack<Integer> stack,int count,int size) {
        //base case
        if (count == size / 2) {
            stack.pop();
            return;
        }

        int top = stack.pop();
        removeMiddleElement(stack,count+1,size);
        stack.push(top);

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
       int size = stack.size();
        removeMiddleElement(stack,0,size);
        System.out.println(stack);
    }
}
