package org.example.containsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length <= 1 || k <= 0) {
            return false;
        }

        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (numIndexMap.containsKey(num) && i - numIndexMap.get(num) <= k) {
                return true; 
            }

            numIndexMap.put(num, i);
        }

        return false;
    }
}
