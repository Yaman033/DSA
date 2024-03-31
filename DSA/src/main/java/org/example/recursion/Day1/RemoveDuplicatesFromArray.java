package org.example.recursion.Day1;

public class RemoveDuplicatesFromArray {

    public void removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println(index);
    }


}
