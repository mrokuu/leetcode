package org.example.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int unuqie = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unuqie] = nums[i];
                unuqie++;
            }
        }

        return unuqie;
    }
}
