package org.example;


import org.example.removeDuplicatesfromSortedArrayII.RemoveDuplicatesfromSortedArrayII;
import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.shuffleString.ShuffleString;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

       ReverseString reverseString = new ReverseString();
       String s = "the sky is blue";

        System.out.println(reverseString.reverseString(s));
    }
}