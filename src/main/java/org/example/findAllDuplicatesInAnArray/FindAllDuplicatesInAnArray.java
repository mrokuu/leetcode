package org.example.findAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int el : nums){
            map.put(el, map.getOrDefault(el, 0)+1);
        }


        List<Integer> list = new ArrayList<>();

        for(int num : map.keySet()){
            if(map.get(num) >1){
                list.add(num);
            }
        }

        return list;
    }
}
