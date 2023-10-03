package org.example.moveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int zeroes = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[zeroes] = nums[i];
                zeroes++;
            }
        }

        for(int i = zeroes; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}
