package org.example.recursion.Day1;

import java.util.List;

public class Subsets {

    public int subsets(List<Integer> recList, int i, List<Integer> list) {
        if (recList.size() == i) {
            System.out.println(list);
            return 0;
        }

        // recCall for take first element from list
        list.add(recList.get(i));
        subsets(recList, i + 1, list);

        // recCall for not taking first element from list
        list.remove(list.size()-1);
        subsets(recList, i + 1, list);

        return 1;


    }
}
