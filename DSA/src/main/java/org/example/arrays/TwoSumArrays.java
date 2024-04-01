package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArrays {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resp = new HashMap<>();

        //create map
        for (int i = 0; i < nums.length; i++) {
            resp.put(nums[i], i);
        }

        System.out.println(String.valueOf(Integer.parseInt("4321") + 1));

        for (int i = 0; i < nums.length; i++) {
            int subtract = target - nums[i];
            if (resp.containsKey(subtract) && resp.get(subtract) != i) {
                return new int[]{i, resp.get(subtract)};
            }

        }
        return new int[]{}; // No solution found
    }
}
