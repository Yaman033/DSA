package org.example.recursion.Day1;

public class ReverseAString {

    public static void reverseAString() {
        String name = "naman";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        if (name.equalsIgnoreCase(rev)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT-PALINDROME");

        }
    }


    public static void main(String[] args){
        reverseAString();
    }
}
