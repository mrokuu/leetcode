package org.example.palindromeNumber9;

public class PalindromeNumber {
    public boolean IsPalindrome(int x) {
        if(x < 0) return false;

        int reversedNum = 0;
        int palindrome = x;
        while(palindrome != 0){
            int reminder = palindrome % 10;
            reversedNum = reversedNum * 10 + reminder;
            palindrome = palindrome / 10;
        }

        if(x == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
