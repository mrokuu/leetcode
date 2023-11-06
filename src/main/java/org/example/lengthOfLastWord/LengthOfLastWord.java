package org.example.lengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String [] array = s.split(" ");


        int len = array.length -1;
        return array[len].length();
    }
}
