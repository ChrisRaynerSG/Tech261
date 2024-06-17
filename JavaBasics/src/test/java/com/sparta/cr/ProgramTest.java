package com.sparta.cr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Given a time of 12, the greeting should be Good afternoon!")
    void checkThat12GivesGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "Good afternoon!".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    @DisplayName("Given a valid time an output is displayed")
    void checkThatAllValidTimesHaveOutput(){
        boolean validOutput = true;
        for(int i = 0; i<23; i++){
            if(Program.getGreeting(i).isEmpty()){
                validOutput = false;
            }
            Assertions.assertTrue(validOutput);
        }
    }
    @Test
    @DisplayName("Given an invalid time message output should reflect that")
    void checkThatInvalidTimeOutputCorrect(){
        int time = 25;
        String expectedGreeting = "invalid time of day".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("Given a negative time message output should reflect that")
    void checkForNegativeNumberOutput(){
        int time = -1;
        String expectedGreeting = "invalid time of day".toLowerCase();
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
}