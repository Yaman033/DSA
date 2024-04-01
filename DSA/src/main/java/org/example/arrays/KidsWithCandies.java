package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            Boolean flag = Boolean.FALSE;
            for (int j = 0; j < candies.length; j++) {
                flag = Boolean.FALSE;
                if ((candies[i] + extraCandies) >= candies[j]) {
                    flag = Boolean.TRUE;
                }else{
                    flag = Boolean.FALSE;
                    break;
                }
            }
            output.add(flag);
        }
        System.out.println(output);
        return output;
    }
}
