package org.example.arrays;

public class ShuffleTheArray {

    public void shuffleTheArray(int[] nums, int n){
        int[] output = new int[nums.length];
        String a = "a";
        char a1 = 'x';
        String.valueOf(a1);
        for(int i=0;i<n;i++){
            output[2*i] = nums[i];
            output[(2*i)+1] = nums[i+n];
        }

        for(int i=0;i<output.length;i++){
           System.out.print(output[i]);
        }
    }
}
