package org.example.palindromNumber;

public class PalindromNumber {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;

        if(x < 0 || x % 10 == 0) return false;

        int palindrome = x;
        int revesedNumber = 0;
        while(palindrome != 0){
            int reminder = palindrome % 10;
            revesedNumber = revesedNumber * 10 + reminder;
            palindrome /= 10;
        }

        if(x == revesedNumber )
            return true;
        else
            return false;

    }
}
