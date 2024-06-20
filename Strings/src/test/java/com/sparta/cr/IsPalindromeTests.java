package com.sparta.cr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsPalindromeTests {
    @Test
    void doesNullStringProvideFalse(){
        //Arrange
        String stringToCheck = null;
        boolean expectedValue = false;

        //Act

        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert

        Assertions.assertEquals(expectedValue,actualValue);
    }
    @Test
    void doesEmptyStringProvideFalse(){
        //Arrange
        String stringToCheck = "";
        boolean expectedValue = false;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void doesStringLessThanThreeProvideFalse(){
        //Arrange
        String stringToCheck = "aa";
        boolean expectedValue = false;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }
    @Test
    void doesStringMoreThanThreeLengthProvideFalseIfNoPalindrome(){
        //Arrange
        String stringToCheck = "Calculator";
        boolean expectedValue = false;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);

    }
    @Test
    void doesStringMoreThanThreeLengthProvideTrueIfPalindrome(){
        //Arrange
        String stringToCheck = "racecar";
        boolean expectedValue = true;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void doesStringWithMoreThanThreeLengthProvideTrueIfPalindromeAndLowerAndUpperCasesMixed(){
        //Arrange
        String stringToCheck = "rAcECaR";
        boolean expectedValue = true;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void doesStringWithMoreThanThreeLengthProvideFalseIfPalindromeAndWhiteSpace(){
        //Arrange
        String stringToCheck = "Racecar  ";
        boolean expectedValue = false;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void doesStringWithMoreThanThreeLengthProvideTrueIfPalindromeWithWhiteSpaceInBetween(){
        //Arrange
        String stringToCheck = " R a c E c A r ";
        boolean expectedValue = true;

        //Act
        boolean actualValue = IsPalindrome.isPalindrome(stringToCheck);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }


}
