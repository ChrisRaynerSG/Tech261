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
