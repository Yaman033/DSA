package org.example.recursion.Day1;

public class Fibonacci {
    public int fibonacci(int n){

        if(n ==0 || n==1){
            return  n;
        }
        int recCall = fibonacci(n-1);
        int recCall1 = fibonacci(n-2);

        //small cal
        int smallCal = recCall+recCall1;

        return smallCal;
    }

}
