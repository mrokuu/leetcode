package org.example.reverseString;

public class ReverseString {

    public String reverseString(String str){
        StringBuffer result = new StringBuffer();
        for(int i = str.length() -1; i >=0; i--){
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
