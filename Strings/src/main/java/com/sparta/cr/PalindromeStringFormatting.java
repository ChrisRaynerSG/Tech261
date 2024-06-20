package com.sparta.cr;

public class PalindromeStringFormatting {
    static final String ACCEPTABLE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz ";

    static String stripSpecialCharacters(String inputString){
        StringBuilder outputString = new StringBuilder();
        if (inputString == null || inputString.isEmpty())
            return outputString.toString();

        for(int inputStringIndex = 0; inputStringIndex < inputString.length(); inputStringIndex++){
            for (int acceptableCharactersIndex = 0; acceptableCharactersIndex < ACCEPTABLE_CHARACTERS.length(); acceptableCharactersIndex++){
                if(inputString.charAt(inputStringIndex) == ACCEPTABLE_CHARACTERS.charAt(acceptableCharactersIndex)){
                    outputString.append(inputString.charAt(inputStringIndex));
                    break;
                }
            }
        }
        return outputString.toString();
    }
}
