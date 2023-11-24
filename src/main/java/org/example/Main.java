package org.example;


import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.shuffleString.ShuffleString;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram", t = "nagaram";

        validAnagram.isAnagram(s,t);
    }
}