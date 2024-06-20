package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PalindromeStringFormattingTests {
    @Test
    void givenNullStringReturnEmptyString(){
        //Arrange
        String input = null;
        String expected = "";

        //Act
        String actual = PalindromeStringFormatting.stripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenEmptyStringReturnEmptyString() {
        //Arrange
        String input = "";
        String expected = "";

        //Act
        String actual = PalindromeStringFormatting.stripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource
    void givenStringReturnStringWithNoSpecialCharacters(String input, String expected){
        //Arrange
        //MethodSource

        //Act
        String actual = PalindromeStringFormatting.stripSpecialCharacters(input);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> givenStringReturnStringWithNoSpecialCharacters(){
        return Stream.of(
                Arguments.of("hello i am a string", "hello i am a string"),
                Arguments.of("he!!llo i am a str!ng", "hello i am a strng"),
                Arguments.of("!!%&$*(£", ""),
                Arguments.of("hello !&^**&^", "hello ")
        );
    }
}
