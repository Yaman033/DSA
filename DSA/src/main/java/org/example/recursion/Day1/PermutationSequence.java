package org.example.recursion.Day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationSequence {

    public List<String>  respList = new ArrayList<>();

    public void permutationSequence(int n,int k,int i){

       int[] a = prepareInputArray(n);
       helper(n,i,a);
       Collections.sort(respList);
        System.out.println(respList);
        System.out.println(respList.get(k-1));
    }


    public void helper(int n, int i, int x[]) {

        if (i == n) {
            String resp = "";
            for (int y = 0; y < x.length; y++) {
                resp += x[y];
            }
            respList.add(resp);
            return;
        }

        for (int j = i; j < x.length; j++) {

            //swap
            swap(i, j, x);
            helper(n, i + 1, x);
            //backtrack
            swap(i, j, x);
        }


    }

    public int[] prepareInputArray(int n) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = i + 1;
        }

        return b;
    }

    public void swap(int i, int j, int x[]) {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

}