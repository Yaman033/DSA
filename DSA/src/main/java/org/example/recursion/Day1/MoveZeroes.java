package org.example.recursion.Day1;

public class MoveZeroes {

    public void moveZeroes(int[] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] == 0) {
                    swap(i,j,nums);
                }

            }
        }

        for(int x=0;x<nums.length;x++){
            System.out.println(nums[x]);
        }


    }

    public void swap(int i,int j,int[] nums){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
