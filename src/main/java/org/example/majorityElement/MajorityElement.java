package org.example.majorityElement;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int el : nums){
            map.put(el, map.getOrDefault(el, 0)+1);
        }

        int majorityElement = 0;
        int maxCount = 0;
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count > maxCount) {
                majorityElement = num;
                maxCount = count;
            }
        }

        return majorityElement;


    }
}
