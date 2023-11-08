package org.example.shuffleString;

public class ShuffleString {

    public static void restoreString(String s, int[] indices) {
        char [] str = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            System.out.println(indices[i]);
            str[indices[i]] = s.charAt(i);
        }

//        return String.valueOf(str);
    }
}
