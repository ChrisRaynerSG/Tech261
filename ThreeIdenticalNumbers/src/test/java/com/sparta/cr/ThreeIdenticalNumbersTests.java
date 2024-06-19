package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ThreeIdenticalNumbersTests {

    @Test
    @DisplayName("Given an empty array return false")
    void givenEmptyArrayReturnFalse(){

        //Arrange
        int[] inputArray = {};
        boolean expectedResult = false;

        //Act
        boolean actualResult = ThreeIdenticalNumbers.doesContainThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given Array of less than three numbers return false")
    void givenArrayLengthLessThanThreeReturnFalse(int[] inputArray, boolean expectedResult){
        //Arrange
        //Done in Method Source

        //Act
        boolean actualResult = ThreeIdenticalNumbers.doesContainThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> givenArrayLengthLessThanThreeReturnFalse(){
        return Stream.of(
                Arguments.of(new int[]{0}, false),
                Arguments.of(new int[]{1,4}, false)
        );
    }
}


