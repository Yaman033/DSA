package org.example.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumIndexSumofTwoLists {
    Map<String,Integer> map = new HashMap<>();

    public void minimumIndexSumOfTwoLists(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equalsIgnoreCase(list2[j])) {
                    map.put(list1[i], i + j);
                }
            }
        }
        for (Map.Entry<String, Integer> res : map.entrySet()) {
            if (res.getValue().equals(Collections.min(map.values()))) {
                list.add(res.getKey());
            }
        };

        String[] result = new String[list.size()];
        int i = 0;
        for (String s : list) {
            result[i] = s;
            i++;
        }
    }

}
