package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {

    public List<String> gloablList = new ArrayList<>();

    public void isSubsequence(String s, String t) {
        String subs = "";
        helper(t, subs, 0);
        if (gloablList.contains(s)) {
            System.out.println(Boolean.TRUE);
        } else {
            System.out.println(Boolean.FALSE);
        }

    }

    public void helper(String original, String ans, int i) {
        if (original.length() == i) {
            gloablList.add(ans);
            System.out.println(ans);
            return;
        }
        //take
        helper(original, ans + original.charAt(i), i + 1);

        //not take
        helper(original, ans, i + 1);

    }
}
