package org.example.recursion.Day1;

public class StringCompare {

    public void stringComapre(String haystack, String needle) {


        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (Character.valueOf(haystack.charAt(i)) == Character.valueOf(needle.charAt(0))) {
                if (haystack.substring(i, needle.length()+i).equals(needle)) {
                    System.out.println(i);
                }
            }
        }

    }
}
