package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutations {
     Map<Integer,List<Integer>> map = new HashMap<>();


    public void swap(int i, int j, int perList[]) {
        int temp = perList[i];
        perList[i] = perList[j];
        perList[j] = temp;
    }
    public void permutations(int perList[],int i){

        //base case
        if (perList.length == i) {
            List<Integer> resp = new ArrayList<>();
            for (int x = 0; x < perList.length; x++) {
                resp.add(perList[x]);
            }
            System.out.println(resp);
            return;
        }

        //recCal
        for (int j = i; j < perList.length; j++) {

            //i=0,j=0;  1<->1    i=0,j=1,
            //i=1,j=1   2<->2   i=1,j=2,i=2,j=2 return
            //i=2,j=2   3<->3   return
                  //  return
            //backtrack
            //i=2,j=2  3<->3
            //swap
            swap(i, j,perList);

            permutations(perList, i + 1);

            //back track
            swap(i, j, perList);
        }

    }

    public void permute() {
        int a[] = {1, 2, 3};
        permutations(a, 0);
    }

    }
