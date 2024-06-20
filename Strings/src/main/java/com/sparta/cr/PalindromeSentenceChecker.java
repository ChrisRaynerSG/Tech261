package com.sparta.cr;
import java.util.ArrayList;


public class PalindromeSentenceChecker {

    static String getLongestPalindromes(ArrayList<String> stringArrayList) {
        StringBuilder outPutString = new StringBuilder();
        outPutString.append("There are no Palindromes in this sentence");
        ArrayList<String> longestPalindromes = new ArrayList<>();

        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return outPutString.toString();
        }
        StringBuilder longestPalindromesOutput = new StringBuilder();

        for (String word : stringArrayList) {
            if (IsPalindrome.isPalindrome(word)) {
                if (longestPalindromes.isEmpty()) {
                    longestPalindromes.add(word);
                }
                for (String palindrome : longestPalindromes) { //Loop through already present palindromes
                    if (word.length() < palindrome.length()) { //If new word is not longer than current longest, do nothing.

                    }
                    else if (word.length() == palindrome.length()){
                        if (!word.equals(palindrome)){
                            longestPalindromes.add(word);
                            break;
                        }
                    }
                    else{//if new word is longer than any already present remove all palindromes from list and add new one
                        longestPalindromes.clear();
                        longestPalindromes.add(word);
                    }
                }
            }
        }

        if (longestPalindromes.isEmpty()) {
            return outPutString.toString();
        }
        else if (longestPalindromes.size() == 1) {
            String palindromeToAdd = (longestPalindromes.getFirst());
            longestPalindromesOutput.append(palindromeToAdd);
            outPutString.setLength(0);
            outPutString.append("The longest Palindrome in this sentence is: ").append(longestPalindromesOutput);
            return outPutString.toString();
        }
        else {
            for (String palindrome : longestPalindromes) {
                longestPalindromesOutput.append(" ").append(palindrome);
            }
            outPutString.setLength(0);
            outPutString.append("The longest Palindromes in this sentence are:").append(longestPalindromesOutput);
            return outPutString.toString();
        }
    }
}