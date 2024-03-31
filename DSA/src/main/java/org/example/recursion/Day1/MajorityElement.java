package org.example.recursion.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {

//    public void majorityElement(int[] nums) {
//        Integer count = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], count);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > nums.length/2) {
//                System.out.println(entry.getKey());
//            }
//        }
//
//    }


    public void majorityElement1(int[] nums) {
        Integer count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], count);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                System.out.println(entry.getValue());
            }
        }

    }
}
