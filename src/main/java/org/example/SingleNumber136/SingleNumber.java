package org.example.SingleNumber136;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }

        return set.iterator().next();
    }
}
