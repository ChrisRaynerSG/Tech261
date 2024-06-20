package com.sparta.cr;
import java.util.ArrayList;

public class PalindromeSentenceChecker {

    static String getLongestPalindromes(String inputString) {
        ArrayList<String> stringArrayList;
        stringArrayList = PalindromeStringFormatting.getArrayOfIndividualWords(inputString);
        StringBuilder outPutString = new StringBuilder();
        outPutString.append("There are no Palindromes in this sentence");
        ArrayList<String> longestPalindromes = new ArrayList<>();

        if (stringArrayList.isEmpty()) {
            return outPutString.toString();
        }
        StringBuilder longestPalindromesOutput = new StringBuilder();

        for (String word : stringArrayList) {
            if (IsPalindrome.isPalindrome(word)) {
                if (longestPalindromes.isEmpty()) {
                    longestPalindromes.add(word);
                }
                else if(word.length() < longestPalindromes.getFirst().length()){
                    //If new word is not longer than current longest, do nothing.
                }
                else if (word.length() == longestPalindromes.getFirst().length()) { //If new word is same length as palindrome and not the same as any word in list add word to list of longest palindromes
                    if (!longestPalindromes.contains(word)) {
                        longestPalindromes.add(word);
                    }
                }
                else{ //If new word is longer, clear the list and add the new word
                    longestPalindromes.clear();
                    longestPalindromes.add(word);
                }
            }
        }
        if (longestPalindromes.isEmpty()) { //If no palindromes found return default output string
            //No change to output string
        }
        else if (longestPalindromes.size() == 1) { //If only one palindrome display correct message
            String palindromeToAdd = (longestPalindromes.getFirst());
            longestPalindromesOutput.append(palindromeToAdd);
            outPutString.setLength(0);
            outPutString.append("The longest Palindrome in this sentence is: ").append(longestPalindromesOutput);

        }
        else {
            for (String palindrome : longestPalindromes) { //If multiple palindromes display correct message
                longestPalindromesOutput.append(" ").append(palindrome);
            }
            outPutString.setLength(0);
            outPutString.append("The longest Palindromes in this sentence are:").append(longestPalindromesOutput);

        }
        return outPutString.toString();
    }
}