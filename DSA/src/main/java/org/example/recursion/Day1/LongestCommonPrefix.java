package org.example.recursion.Day1;

import java.util.Arrays;

public class LongestCommonPrefix {

    public void longestCommonPrefix(String[] strs) {
        String prefix = "";
        // 0 and 1

        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            if (i < strs[strs.length - 1].length() && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                prefix += strs[0].charAt(i);
            } else {
                break;
            }
        }
        System.out.println(prefix);

    }
}
