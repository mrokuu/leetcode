package org.example;


import org.example.minimumSizeSubarraySum.MinimumSizeSubarraySum;
import org.example.removeDuplicatesfromSortedArrayII.RemoveDuplicatesfromSortedArrayII;
import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.shuffleString.ShuffleString;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        int target = 7;
        int [] nums = {2,3,1,2,4,3};

        System.out.println( minimumSizeSubarraySum.minSubArrayLen(target, nums));
    }
}