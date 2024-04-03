package org.example.stack;

import java.util.Stack;

public class ReverseAString {

    public static void reverseString() {

        String str = "Yaman";
        String strRev = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }

        while (!stack.isEmpty()) {
            strRev +=stack.peek();
            stack.pop();
        }

        System.out.println(strRev);

    }

    public static void main(String args[]){
        reverseString();
    }
}
