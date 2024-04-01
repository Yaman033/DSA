package org.example.arrays;

public class RunningSum {

    public void runningSum(int[] nums) {

        int sum = 0;
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            output[i] = sum;
            sum=0;
        }

        for (int x = 0; x < output.length; x++) {
            System.out.println(output[x]);
        }
    }

}

