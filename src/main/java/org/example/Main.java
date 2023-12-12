package org.example;


import org.example.removeDuplicatesfromSortedArrayII.RemoveDuplicatesfromSortedArrayII;
import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.shuffleString.ShuffleString;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicatesfromSortedArrayII removeDuplicatesfromSortedArrayII = new RemoveDuplicatesfromSortedArrayII();
        int [] array = {0,0,1,1,1,1,2,3,3};
        removeDuplicatesfromSortedArrayII.removeDuplicates(array);
    }
}