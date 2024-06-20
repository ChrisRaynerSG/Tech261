package com.sparta.cr;

public class IsPalindromeStringBuilder {

    static boolean isPalindrome(String stringToCheck){
        if(stringToCheck == null || stringToCheck.length() < 3){
            return false;
        }
        stringToCheck = stringToCheck.toLowerCase();
        StringBuilder stringToCheckReversed = new StringBuilder(stringToCheck);
        stringToCheckReversed.reverse();
        return stringToCheck.equals(stringToCheckReversed.toString());
    }
}
