package com.sparta.cr;
import java.util.ArrayList;
import java.util.List;

public class PalindromeStringFormatting {
    static final String ACCEPTABLE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz ";

    static String getStripSpecialCharacters(String inputString){
        StringBuilder outputString = new StringBuilder();
        if (inputString == null || inputString.isEmpty()) {
            return outputString.toString();
        }
        inputString = inputString.toLowerCase();
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

    static List<String> getArrayOfIndividualWords(String inputString){
        StringBuilder singleWord = new StringBuilder();
        List<String> outputStringArrayList = new ArrayList<String>();

        if (inputString == null || inputString.isEmpty()) {
            return outputStringArrayList;
        }

        inputString = getStripSpecialCharacters(inputString);

        for(int inputStringIndex = 0; inputStringIndex < inputString.length(); inputStringIndex++){
            if(inputString.charAt(inputStringIndex) != ' '){
                singleWord.append(inputString.charAt(inputStringIndex));
                if(!singleWord.isEmpty() && inputStringIndex == inputString.length()-1){
                    outputStringArrayList.add(singleWord.toString());
                }
            }
            else{
                if (!singleWord.isEmpty()) {
                    outputStringArrayList.add(singleWord.toString());
                }
                singleWord.setLength(0);
            }
        }
        return outputStringArrayList;
    }
}
