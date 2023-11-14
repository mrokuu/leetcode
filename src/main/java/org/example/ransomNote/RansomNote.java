package org.example.ransomNote;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!letterCounts.containsKey(c) || letterCounts.get(c) <= 0) {
                return false;
            }
            letterCounts.put(c, letterCounts.get(c) - 1);
        }

        return true;
    }
}
