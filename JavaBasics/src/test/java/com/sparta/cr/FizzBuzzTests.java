package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    // Print numbers in order
    // If number divisible by 3 print "Fizz"
    // If number divisible by 5 print "Buzz"
    // If number divisible by 3 and 5 print "FizzBuzz"

    @Test
    @DisplayName("given number one then number one is printed")
    void givenAnInputOfOneThenFizzBuzzReturnsOne(){
        //Arrange
        int input = 1;
        String expected = "1";

        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    //Parameterized tests

    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    @DisplayName("given number divisble by 3 then output should be Fizz")
    void givenInputOfThreeFizzBuzzReturnsFizz(int input){
        //Arrange
        String expected = "Fizz";

        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz"
            })
    @DisplayName("Given a multiple of 5 FizzBuzz returns Buzz")
    void givenInputOfMultipleOfFiveFizzBuzzReturnsBuzz(int input, String expected){
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
                    "15, FizzBuzz",
                    "30, FizzBuzz",
                    "60, FizzBuzz"
            })
    @DisplayName("Given a multiple of 3 & 5 FizzBuzz returns FizzBuzz")
    void givenInputOfMultipleOfFiveAndThreeFizzBuzzReturnsFizzBuzz(int input, String expected){
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "4, 4",
            "7, 7"
    })
    @DisplayName("Given an input not divisible by three or five, Fizz Buzz returns the number")
    void givenInputNotDivisibleByThreeOrFiveGetFizzBuzzFromReturnsThatNumber(int input, String expected){
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected,actual);
    }
}
