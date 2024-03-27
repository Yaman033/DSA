package org.example.recursion.Day1;

public class ReverseWordsInString {

    public void reverseWords(String s) {
        String newString = "";

        String[] split = s.trim().split("\\s+");
        for (int i = split.length - 1; i >= 0; i--) {
            newString += split[i];
            if (i != 0) {
                newString += " ";
            }
        }
        System.out.println(newString);
    }
}
