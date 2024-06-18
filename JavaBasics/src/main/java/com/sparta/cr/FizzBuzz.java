package com.sparta.cr;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int number){
        String fizzBuzzString = Integer.toString(number);
        Boolean isMultipleOfThree = (number%3==0);
        Boolean isMultipleOfFive = (number%5==0);

        if(isMultipleOfThree){
            if(isMultipleOfFive){
                fizzBuzzString = "FizzBuzz";
                return fizzBuzzString;
            }
            fizzBuzzString = "Fizz";
            return fizzBuzzString;
        }
        else if(isMultipleOfFive){
            fizzBuzzString ="Buzz";
        }
        return fizzBuzzString;
    }
}
