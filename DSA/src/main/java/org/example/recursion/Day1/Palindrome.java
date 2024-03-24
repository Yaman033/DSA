package org.example.recursion.Day1;

public class Palindrome {

    public Boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return Boolean.TRUE;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return Boolean.FALSE;
        }
        return isPalindrome(s, start + 1, end - 1);
    }
}
