package org.example.stack;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void previousSmallerElement(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(a[i]);
        }

    }

    public static void main(String[] args) {

        int[] a = {4, 10, 5, 18, 3, 12, 7};
        previousSmallerElement(a);

    }
}
