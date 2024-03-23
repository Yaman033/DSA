package org.example.recursion.Day1;

public class Factorial {

    public int factorial(int n) {

        //base case
        if (n == 0 || n == 1) {
            return 1;
        }

        //recursive call
        int recCal = factorial(n - 1);

        //small calculation
        int smallCal = n * recCal;

        return smallCal;

    }

}
