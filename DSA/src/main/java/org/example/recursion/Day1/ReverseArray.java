package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public List<Integer> reverseArray(List<Integer> revList, int end, List<Integer> list) {
        if (end < 0) {
            return list;
        }
        swap(revList, end, list);
        return reverseArray(revList, end - 1, list);
    }

    void swap(List<Integer> rev, int end, List<Integer> list) {
        list.add(rev.get(end));
    }
}
