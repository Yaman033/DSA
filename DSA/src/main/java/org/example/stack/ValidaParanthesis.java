package org.example.stack;

import java.util.Stack;

public class ValidaParanthesis {

    public static void validaParenthesis(Stack<Character> stack, String str) {

        for (int i = 0; i < str.length(); i++) {

            Character c =str.charAt(i);
            //if openning brackets
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }

            //if closing brackets
            if (c == '}' || c == ']' || c == ')') {
                if (!stack.isEmpty()) {
                    // check top
                    Character top = stack.peek();
                    if ((c == '}' && top == '{') || (c == ')' && top == '(') || (c == ']' && top == '[')) {
                        stack.pop();
                    }else{
                        System.out.println("NotBalanced");
                        return;
                    }
                } else {
                    System.out.println("NotBalanced");
                }

            }
        }

        if(stack.isEmpty()){
            System.out.println("Balanced");
        }
    }

    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        String str = "()";
        validaParenthesis(stack,str);

    }
}
