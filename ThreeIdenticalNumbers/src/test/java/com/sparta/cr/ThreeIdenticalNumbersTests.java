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
        boolean actualResult = ArrayCheck.hasThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given Array of less than three numbers return false")
    void givenArrayLengthLessThanThreeReturnFalse(int[] inputArray){
        //Arrange
        boolean expectedResult = false;

        //Act
        boolean actualResult = ArrayCheck.hasThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given Array of three numbers or more return false if no three consecutive numbers are identical")
    void givenArrayIfNoThreeConsecutiveNumbersIdenticalReturnFalse(int[] inputArray){
        //Arrange
        boolean expectedResult = false;

        //Act
        boolean actualResult = ArrayCheck.hasThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);

    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given Array of three numbers or more return true if three consecutive numbers are identical")
    void givenArrayIfThreeConsectuiveNumbersIdenticalReturnTrue(int [] inputArray){
        //Arrange
        boolean expectedResult = true;

        //Act
        boolean actualResult = ArrayCheck.hasThreeConsecutiveIdenticalNumbers(inputArray);

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> givenArrayLengthLessThanThreeReturnFalse(){
        return Stream.of(
                Arguments.of(new int[]{0}),
                Arguments.of(new int[]{1,4})
        );
    }
    public static Stream<Arguments> givenArrayIfNoThreeConsecutiveNumbersIdenticalReturnFalse(){
        return Stream.of(
                Arguments.of(new int[] {2,4,1,2,2,6,4,2,7,8}),
                Arguments.of(new int[] {1,6,22,5,29,2,5,6,1}),
                Arguments.of(new int[] {0,0,5})
        );
    }
    public static Stream<Arguments> givenArrayIfThreeConsectuiveNumbersIdenticalReturnTrue(){
        return Stream.of(
                Arguments.of(new int[]{1,1,1}),
                Arguments.of(new int[]{1,5,1,2,45,5,9,1,9,9,9}),
                Arguments.of(new int[]{1,2,3,4,5,5,5,4,3,2,1}),
                Arguments.of(new int[]{0,0,0})
        );
    }
}


