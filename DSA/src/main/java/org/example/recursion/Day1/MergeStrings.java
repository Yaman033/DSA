package org.example.recursion.Day1;

import java.util.HashMap;
import java.util.Map;

public class MergeStrings {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String result = "";
        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                result += word1.charAt(i);
            }
            if (i < word2.length()) {
                result += word2.charAt(i);
            }
            i++;

        }
        System.out.println(result);
        return result;
    }

}
