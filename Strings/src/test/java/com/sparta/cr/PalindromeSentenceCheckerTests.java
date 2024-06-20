package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class PalindromeSentenceCheckerTests {
    @ParameterizedTest
    @ValueSource(strings = {"Hello this is to check if there are any palindromes in this","are there any here?","one more test for good measure"})
    void givenASentenceWithNoPalindromesThenMessageShouldReflectThat(String inputString){
        //Arrange
        String expected = "There are no Palindromes in this sentence";

        //Act
        String actual = PalindromeSentenceChecker.getLongestPalindromes(PalindromeStringFormatting.getArrayOfIndividualWords(inputString));

        //Assert
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Madam","The madam was very fast","madam is a name"})
    void givenASentenceWithOnePalindromeThenMessageShouldReflectThat(String inputString){
        //Arrange
        String expected = "The longest Palindrome in this sentence is: madam";

        //Act
        String actual = PalindromeSentenceChecker.getLongestPalindromes(PalindromeStringFormatting.getArrayOfIndividualWords(inputString));

        //Assert
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"madam Madam madam", "hello madam, there is a madam", "madam is a Madam"})
    void givenASentenceWithMultiplePalindromesOnlyReturnOneIfTheyAreAllTheSameWithMessage(String inputString){
        //Arrange
        String expected = "The longest Palindrome in this sentence is: madam";

        //Act
        String actual = PalindromeSentenceChecker.getLongestPalindromes(PalindromeStringFormatting.getArrayOfIndividualWords(inputString));

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Racecar is a palindrome so is Madam", "A Racecar is much faster than a person called Anna"})
    void givenASentenceWithMultiplePalindromesOnlyReturnOneIfOneIsLongerWithMessage(String inputString){
        //Arrange
        String expected = "The longest Palindrome in this sentence is: racecar";

        //Act
        String actual = PalindromeSentenceChecker.getLongestPalindromes(PalindromeStringFormatting.getArrayOfIndividualWords(inputString));

        //Assert
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource
    void givenASentenceWithMultiplePalindromesReturnTheLongestIfMultipleOfSameLengthWithMessage(String inputString, String expected){
        //Arrange
        //Method Source

        //Act
        String actual = PalindromeSentenceChecker.getLongestPalindromes(PalindromeStringFormatting.getArrayOfIndividualWords(inputString));

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    static Stream<Arguments> givenASentenceWithMultiplePalindromesReturnTheLongestIfMultipleOfSameLengthWithMessage(){
        return Stream.of(
                Arguments.of("Racecar is the same length as ghibihg","The longest Palindromes in this sentence are: racecar ghibihg"),
                Arguments.of("Anna is a palindrome, so is racecar and ghibihg","The longest Palindromes in this sentence are: racecar ghibihg"),
                Arguments.of("Racecar is a palindrome, so is anna, but Rotavator, Malayalam and Googogoog are even longer palindromes", "The longest Palindromes in this sentence are: rotavator malayalam googogoog"),
                Arguments.of("Racecar, Anna, Deified", "The longest Palindromes in this sentence are: racecar deified")
        );
    }
}
