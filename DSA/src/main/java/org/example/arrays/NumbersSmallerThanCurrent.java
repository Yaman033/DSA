package org.example.arrays;

public class NumbersSmallerThanCurrent {

    public void numbersSmallerThanCurrent(int[] nums) {
        int count = 0;
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            output[i] = count;
            count = 0;
        }
        for (int x = 0; x < output.length; x++) {
            System.out.println(output[x]);
        }
    }
}
