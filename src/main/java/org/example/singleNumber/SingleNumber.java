package org.example.singleNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for( int el : nums){
            map.put(el, map.getOrDefault(el, 0)+1);
        }

        for(Map.Entry<Integer, Integer> el : map.entrySet()){
            if(el.getValue() == 1){
                return el.getKey();
            }
        }
    return  -1;
    }



}
