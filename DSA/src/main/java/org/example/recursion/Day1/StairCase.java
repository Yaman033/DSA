package org.example.recursion.Day1;

public class StairCase {

    public int staircase(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int recCal1 = staircase(n - 1);
        int recCal2 = staircase(n - 2);
        int smallCal = recCal1 + recCal2;

        return smallCal;

    }
}
