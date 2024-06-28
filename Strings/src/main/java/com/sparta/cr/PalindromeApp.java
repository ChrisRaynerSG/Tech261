package com.sparta.cr;

public class PalindromeApp {
    public static void main(String[] args) {
        PalindromeLogger palindromeLogger = new PalindromeLogger();
        palindromeLogger.getLogger().info(PalindromeSentenceChecker.getLongestPalindromes("How many palindromes are in this sentence?"));
        palindromeLogger.getLogger().info(PalindromeSentenceChecker.getLongestPalindromes("Racecar is a very fast type of car lets go broom anna"));
        palindromeLogger.getLogger().info(PalindromeSentenceChecker.getLongestPalindromes("Racecar racecar! r!a!cecAr! Rotavator    "));
    }
}
