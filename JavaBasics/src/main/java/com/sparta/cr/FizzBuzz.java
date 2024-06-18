package com.sparta.cr;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int number){
        String fizzBuzzString = Integer.toString(number);

        if(FizzBuzz.isMultipleOfThree(number)){
            if(FizzBuzz.isMultipleOfFive(number)){
                fizzBuzzString = "FizzBuzz";
                return fizzBuzzString;
            }
            fizzBuzzString = "Fizz";
            return fizzBuzzString;
        }
        else if(FizzBuzz.isMultipleOfFive(number)){
            fizzBuzzString ="Buzz";
        }
        return fizzBuzzString;
    }
    public static boolean isMultipleOfThree(int input){
        return (input%3 ==0);
    }
    public static boolean isMultipleOfFive(int input){
        return (input%5 == 0);
    }
}
