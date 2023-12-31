package org.example;


import org.example.minimumSizeSubarraySum.MinimumSizeSubarraySum;
import org.example.removeDuplicatesfromSortedArrayII.RemoveDuplicatesfromSortedArrayII;
import org.example.reverseString.ReverseString;
import org.example.romanToInteger.RomanToInteger;
import org.example.rotateArray.RotateArray;
import org.example.shuffleString.ShuffleString;
import org.example.validAnagram.ValidAnagram;
import org.example.validPalindrome.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        RotateArray rotateArray = new RotateArray();
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;


        rotateArray.rotate(nums, k);
    }
}