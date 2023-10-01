package org.example.twoSum;

public class TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] + nums[i+1] == target){
//                return new int[] {i,i+1};
//            }
//        }
//        throw new IllegalArgumentException("No solution exists");
//    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution exists");

    }

}
