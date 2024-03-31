package org.example.Arrays;

import java.sql.Array;
import java.util.*;

public class KeyboardRow {

    public void keyboardRow(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> resp = new ArrayList<>();

        String respWords[] = new String[words.length];


        for (String word : words) {
            int rows[] = new int[3];
            for (char c : word.toLowerCase().toCharArray()) {
                if (row1.indexOf(Character.valueOf(c)) != -1) {
                    rows[0] = 1;
                }
                if (row2.indexOf(Character.valueOf(c)) != -1) {
                    rows[1] = 1;
                }
                if (row3.indexOf(Character.valueOf(c)) != -1) {
                    rows[2] = 1;
                }
            }
            int sum = rows[0] + rows[1] + rows[2];
            if (sum == 1) {
                resp.add(word);
            }
        }

        for (int i = 0; i < resp.size(); i++) {
            respWords[i] = resp.get(i);
            System.out.println(respWords[i]);
        }

    }
}
