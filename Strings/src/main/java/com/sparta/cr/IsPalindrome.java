package com.sparta.cr;

import java.lang.reflect.Array;

public class IsPalindrome {

    static boolean isPalindrome(String stringToCheck){
        if(stringToCheck == null || stringToCheck.length() < 3){
            return false;
        }
        char[] lettersInString = stringToCheck.toLowerCase().toCharArray();

        boolean isStillPalindrome = true;
        for(int i = 0; i < lettersInString.length; i++) {
            if(lettersInString[i] != lettersInString[lettersInString.length -i -1]){
                isStillPalindrome = false;
                break;
            }
        }
        return isStillPalindrome;
    }
}
