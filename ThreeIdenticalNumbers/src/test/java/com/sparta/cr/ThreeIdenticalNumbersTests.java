package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreeIdenticalNumbersTests {

    @Test
    @DisplayName("Given an empty array return false")
    void givenEmptyArrayReturnFalse(){

        //Arrange
        int[] inputArray = {};
        boolean expectedResult = false;

        //Act
        boolean actualResult = ThreeIdenticalNumbers.doesContainThreeConsecutiveIdenticalNumbers();

        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
