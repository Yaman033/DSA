package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes {

    public void maxConsecutiveOnes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }else{
                count =0;
            }
            if (!map.containsKey(1)) {
                map.put(1, count);

            }
            if (map.get(1) < count) {
                map.put(1, count);
            }
        }

        System.out.println(map.get(1));

    }
}
