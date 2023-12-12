package org.example.ReverseWordsinaString;

public class ReverseWordsinString {

    public String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = str.length-1; i>=0; i--){
            stringBuilder.append(str[i]);
            if (i > 0) {
                stringBuilder.append(" "); // Add a space between words
            }
        }
        return stringBuilder.toString();
    }
}
