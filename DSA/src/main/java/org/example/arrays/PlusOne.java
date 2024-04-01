package org.example.arrays;

public class PlusOne {

    public void plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return; //digits
            }
            digits[i] = 0;

        }


    }
}
