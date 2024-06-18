package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ProgramTest {
    @Test //Annotation carries Metadata. Passes this to JVM
    @DisplayName("This is my first test")
    public void basicTest(){
        Assertions.assertTrue(5==5);
    }
    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good Evening")
    void checkThat21GivesGoodEvening(){
        int time =21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good afternoon!")
    void checkThat12GivesGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "Good afternoon!".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @ParameterizedTest
    @CsvSource({"0, Good morning!",
            "1, Good morning!",
            "2, Good morning!",
            "3, Good morning!",
            "4, Good morning!",
            "5, Good morning!",
            "6, Good morning!",
            "7, Good morning!",
            "8, Good morning!",
            "9, Good morning!",
            "10, Good morning!",
            "11, Good morning!",
            "12, Good afternoon!",
            "13, Good afternoon!",
            "14, Good afternoon!",
            "15, Good afternoon!",
            "16, Good afternoon!",
            "17, Good afternoon!",
            "18, Good evening!",
            "19, Good evening!",
            "20, Good evening!",
            "21, Good evening!",
            "22, Good evening!",
            "23, Good evening!",
           })

    @DisplayName("Given a valid time then an output is displayed")
    void checkThatAllValidTimesHaveOutput(int input, String expected){

        String actual = Program.getGreeting(input);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    @DisplayName("Given an invalid time then message output should reflect that")
    void checkThatInvalidTimeOutputCorrect(){
        int time = 25;
        String expectedGreeting = "invalid time of day".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("Given a negative time then message output should reflect that")
    void checkForNegativeNumberOutput(){
        int time = -1;
        String expectedGreeting = "invalid time of day".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
}