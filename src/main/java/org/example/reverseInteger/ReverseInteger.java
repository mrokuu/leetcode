package org.example.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {


        int reversedInt = 0;

        while(x != 0){
            int reminder = x % 10;
            reversedInt = reversedInt * 10 + reminder;
            x /= 10;
        }

        return reversedInt;
    }
}
