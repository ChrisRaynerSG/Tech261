package com.sparta.cr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class IntFromArrayTests {

    @Test
    @DisplayName("Given an empty array of integers, then 0 should be returned")
    void givenEmptyArrayReturnsZero(){

        //Arrange
        int[] arrayToTest = {};
        int expectedInt = 0;

        //Act
        int actualInt = IntFromArray.getIntFromArray(arrayToTest);

        //Assert
        Assertions.assertEquals(expectedInt,actualInt);
    }

    @Test
    @DisplayName("Given an array of integers, then an integer from that array should be returned ")
    void givenArrayOfIntsReturnSingleInt(){

        //Arrange
        int[] arrayToTest = {1};
        int expectedInt = 1;

        //Act
        int actualInt = IntFromArray.getIntFromArray(arrayToTest);

        //Assert
        Assertions.assertEquals(expectedInt,actualInt);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given an array of integers, then a single int displaying all the integers in the array should be returned ")
    public void givenArrayOfIntsReturnSingleIntWithArrayContents(int[] arrayInput, int numberExpected){

        //Arrange
        //Done in method source

        //Act
        int actualInt = IntFromArray.getIntFromArray(arrayInput);

        //Assert
        Assertions.assertEquals(numberExpected,actualInt);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given an array of integers which starts with 0's return a single int dropping the leading 0's but keeps any subsequent 0's")
    public void givenArrayOfIntsReturnSingleIntWithNoLeadingZeros(int[] arrayInput, int numberExpected){
        //Arrange
        //Done in Method source

        //Act
        int actualInt = IntFromArray.getIntFromArray(arrayInput);

        //Assert
        Assertions.assertEquals(numberExpected,actualInt);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("Given an array of integers including negative integers getIntFromArray returns single int with no negative signs")
    public void givenArrayOfIntsWithNegativesReturnSingleIntWithArrayContents(int[] arrayInput, int numberExpected){
        //Arrange
        //Done in Method Source

        //Act
        int actualInt = IntFromArray.getIntFromArray(arrayInput);

        //Assert
        Assertions.assertEquals(numberExpected,actualInt);
    }

    public static Stream<Arguments> givenArrayOfIntsReturnSingleIntWithArrayContents(){
        return Stream.of(
                Arguments.of(new int[]{1,4,5,7}, 1457),
                Arguments.of(new int[]{2,5,7,12,5},257125),
                Arguments.of(new int[]{1,5,2,1,2},15212)
        );
    }

    public static Stream<Arguments> givenArrayOfIntsReturnSingleIntWithNoLeadingZeros(){
        return Stream.of(
                Arguments.of(new int[]{0,0,1,4,5}, 145),
                Arguments.of(new int[]{0,0,3,0,5,0}, 3050),
                Arguments.of(new int[]{0,0,0,0,0,0}, 0)
        );
    }
    public static Stream<Arguments> givenArrayOfIntsWithNegativesReturnSingleIntWithArrayContents(){
        return Stream.of(
                Arguments.of(new int[]{1,-4,5,-7}, 1457),
                Arguments.of(new int[]{2,-5,7,12,-5},257125),
                Arguments.of(new int[]{-1,5,-2,-1,-2},15212)
        );
    }
}
