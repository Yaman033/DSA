package org.example.recursion.Day1;

public class Subsequences {

    public int subsequences(String s, int i, String subSequence) {

        //base case
        if (s.length() == i) {
            if (subSequence.equalsIgnoreCase("")) {
                System.out.println("yes");
            } else {
                System.out.println(subSequence);
            }
            return 0;
        }

        //recCall for take first char
        subsequences(s, i + 1, subSequence + s.charAt(i));

        //not take first char
        subsequences(s, i + 1, subSequence);

        return 1;
    }
}
