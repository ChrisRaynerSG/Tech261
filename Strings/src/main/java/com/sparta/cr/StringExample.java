package com.sparta.cr;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        String upperCase = string1.toUpperCase(); //Immutable once declared cannot be changed
        System.out.println(upperCase);

        char[] string1CharArray = string1.toCharArray();

        for(char C: string1CharArray){
            System.out.println(C);
        }

        String string = String.valueOf(100);
        System.out.println(string);

        String name = "Chris";
        System.out.println("Hello " + name);

        //String builder creates string use vast majority of string methods, but includes append and insert
        //Handles the memory very efficiently. Creates the illusion that strings are immutable.
        //Another class near identical to String Builder, which is String Buffer. String Buffer is thread safe.
        //Possible to use Thread Buffer when multiple operations are occuring on the same string. Most cases would
        //use string builder.

        //Write a method to check if a string is a palindrome. A palindrome is at least three letters long. A palindrome
        //regardless of case Dad is a palindrome. Strings can be Null, Strings can be Empty.
    }
}
