package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {

    public static List<List<Integer>> response = new ArrayList<>();

    public void combinationSum(int[] candidates, int target) {
        List<List<Integer>> response = new ArrayList<>();
        helper(candidates, target, 0, 0, new ArrayList<>(), response);
        Set<List<Integer>> actResp = new HashSet<>(this.response);
        System.out.println(actResp);
    }

    public void helper(int[] candidates, int target, int i, int sum, List<Integer> respList,List<List<Integer>> response) {

        //bounding case
        if (sum > target) {
            return;
        }

        //base case
       // if ((candidates.length) == i) {
            if (sum == target) {
                this.response.add(new ArrayList<>(respList));
                //System.out.println(respList);
            }
        //    return;
      //  }
        if ((candidates.length) > i) {
            sum += candidates[i];
            respList.add(candidates[i]);
            helper(candidates, target, i, sum, respList, this.response);
            //if(sum>target){
            respList.remove(respList.size() - 1);
            sum -= candidates[i];
            //pop the last added
            helper(candidates, target, i + 1, sum, respList, this.response);
        }
    }
}
