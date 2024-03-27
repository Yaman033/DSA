package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public void reverseVowels(String originalString) {
        List<String> vowelsList = Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U");
        List<String> vowels = new ArrayList<>();
        String newString = "";
        int vowelCount = 0;
        int k = 1;
        for (int i = 0; i < originalString.length(); i++) {
            if (vowelsList.contains(String.valueOf(originalString.charAt(i)))) {
                vowels.add(String.valueOf(originalString.charAt(i)));
            }
        }

        for (int i = 0; i < originalString.length(); i++) {
            if (vowelsList.contains(String.valueOf(originalString.charAt(i)))) {

                newString += vowels.get(vowels.size() - k);
                k++;
            } else {
                newString += originalString.charAt(i);
            }
        }

        System.out.println(newString);
    }
}
