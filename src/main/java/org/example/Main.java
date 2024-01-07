package org.example;


import org.example.minimumSizeSubarraySum.MinimumSizeSubarraySum;
import org.example.removeDuplicatesfromSortedArrayII.RemoveDuplicatesfromSortedArrayII;
import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.rotateArray.RotateArray;
import org.example.shuffleString.ShuffleString;
import org.example.uniqueNumberofOccurrences.UniqueNumberofOccurrences;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        int [] arr = {1,2,2,1,1,3};

        UniqueNumberofOccurrences uniqueNumberofOccurrences = new UniqueNumberofOccurrences();

        uniqueNumberofOccurrences.uniqueOccurrences(arr);
    }
}