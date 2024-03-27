package org.example.recursion.Day1;

import java.util.*;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n, Set<List<Integer>> validate) {
        helper(k, n, new ArrayList<>(), 0, 1, validate);
        return new ArrayList<>(validate);
    }


    public void helper(int k, int n, List<Integer> numbers, int sum, int start, Set<List<Integer>> validate) {


        if (new HashSet<>(numbers).size() == k) {
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }

            if (sum > n) {
                return;
            }
            if (sum == n) {
                Collections.sort(numbers);
                validate.add(new ArrayList<>(numbers));
                numbers = new ArrayList<>();
            }
            return;
        }


        for (int i = start; i <= n; i++) {
            numbers.add(i);
            helper(k, n, numbers, sum, start + 1, validate);

            //back track
            numbers.remove(numbers.size() - 1);
        }
    }
}
