package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public void missingNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        System.out.println(map);

        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(i)){
                System.out.println(i);
            }
        }
       // System.out.println(0);

    }
}
