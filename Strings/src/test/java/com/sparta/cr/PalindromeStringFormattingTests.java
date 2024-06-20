package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PalindromeStringFormattingTests {
    @Test
    void givenNullStringReturnEmptyString(){
        //Arrange
        String input = null;
        String expected = "";

        //Act
        String actual = PalindromeStringFormatting.getStripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenEmptyStringReturnEmptyString() {
        //Arrange
        String input = "";
        String expected = "";

        //Act
        String actual = PalindromeStringFormatting.getStripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource
    void givenStringReturnStringWithNoSpecialCharacters(String input, String expected){
        //Arrange
        //MethodSource

        //Act
        String actual = PalindromeStringFormatting.getStripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource
    void givenStringReturnStringWithNoSpecialCharactersAndAllLowerCase(String input, String expected){
        //Arrange
        //MethodSource

        //Act
        String actual = PalindromeStringFormatting.getStripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource
    void givenStringReturnStringListOfEachIndividualWord(String input, List expected){

        //Act
        List<String> actual = new ArrayList<>(PalindromeStringFormatting.getArrayOfIndividualWords(input));

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    static Stream<Arguments> givenStringReturnStringWithNoSpecialCharacters(){
        return Stream.of(
                Arguments.of("hello i am a string", "hello i am a string"),
                Arguments.of("he!!llo i am a str!ng", "hello i am a strng"),
                Arguments.of("!!%&$*(£", ""),
                Arguments.of("hello !&^**&^", "hello ")
        );
    }

    static Stream<Arguments> givenStringReturnStringWithNoSpecialCharactersAndAllLowerCase(){
        return Stream.of(
                Arguments.of("Hello i am A string", "hello i am a string"),
                Arguments.of("He!!llo i aM a stR!ng", "hello i am a strng"),
                Arguments.of("!!%&$*(£", ""),
                Arguments.of("heLLo !&^**&^", "hello ")
        );
    }

    static Stream<Arguments> givenStringReturnStringListOfEachIndividualWord(){
        List example1 = new ArrayList(List.of("hello","i","am","a","string"));
        List example2 = new ArrayList(List.of("hello","i","am","a","strng"));
        List example3 = new ArrayList(List.of(""));
        List example4 = new ArrayList(List.of("hello"));

        return Stream.of(
                Arguments.of("hello i am a string", example1),
                Arguments.of("he!!Llo i am a str!ng", example2),
                Arguments.of("!!%&$*(£", example3),
                Arguments.of("helLo !&^**&^", example4)
        );
    }
}
