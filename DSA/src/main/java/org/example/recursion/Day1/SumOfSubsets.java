package org.example.recursion.Day1;

import java.util.List;

public class SumOfSubsets {

    public Boolean sumOfSubsets(List<Integer> sumList, int sum, int tempSum, int i) {

        //base-case
        if (sum == tempSum) {
            return Boolean.TRUE;
        }

        if (i >= sumList.size()) {
            return Boolean.FALSE;
        }

        //recursive Call for take
        Boolean recCal1 = sumOfSubsets(sumList, sum, tempSum + sumList.get(i), i + 1);

        //recursive Call for  not take
        Boolean recCal2 = sumOfSubsets(sumList, sum, tempSum, i + 1);


        //small Calculation
        return recCal1 || recCal2;

    }
}
