package org.example.uniqueNumberofOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
    public void uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(frequencyMap.keySet());
        System.out.println(frequencyMap.values());

//        Set<Integer> uniqueOccurrences = new HashSet<>();
//
//        for (int frequency : frequencyMap.values()) {
//            if (!uniqueOccurrences.add(frequency)) {
//                return false;
//            }
//        }
//
//        return true;
    }
}
