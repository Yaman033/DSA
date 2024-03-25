package org.example.recursion.Day1;


import java.util.Arrays;
import java.util.List;

//Letter Combinations of a Phone Number
public class PhoneNumberCombinations {

    public void letterCombinations(String digits) {
        helper(0, digits, "");

    }

    public void helper(int i, String digits, String helperString) {
        //base case
        if (digits.length() == i) {
            System.out.println(helperString);
            return;
        }
        List<String> keys = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");

        for (int j = 0; j < keys.get(Character.getNumericValue(digits.charAt(i))).length(); j++) {
            helper(i + 1, digits, helperString + keys.get(Character.getNumericValue(digits.charAt(i))).charAt(j));
        }

    }
}
