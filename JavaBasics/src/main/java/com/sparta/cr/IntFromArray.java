package com.sparta.cr;

public class IntFromArray {

    public static int getIntFromArray(int[] arrayToTest) {
        StringBuilder finalIntegerString = new StringBuilder();
        if (arrayToTest.length == 0) {
            return 0;
        }
        for (int i : arrayToTest) {
            String integerToAdd = Integer.toString(Math.abs(i));
            finalIntegerString.append(integerToAdd);
        }
        return Integer.parseInt(finalIntegerString.toString());
    }
}

//Code Review details
//1. intention: What is the probalem and (without code) and what was your plan to solve it? Logic/Algorithm used etc
//Double check and don't make assumptions.
//2. Implementation: How did you implement your solution?
//3. Refactoring and testing.
// Write code to anticipate future extension.