package org.example.validPalindrome125;

public class ValidPalindrome {
    public boolean IsPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                str.append(c);
            }
        }
        String st = str.toString().toLowerCase().trim();

        int left = 0;
        int right = st.length()-1;
        while(left < right){
            if(st.charAt(left) != st.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
