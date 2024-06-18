package com.sparta.cr;

public class IntFromArray {

    public static int getIntFromArray(int[] arrayToTest){
        String finalIntegerString ="";
        int finalInt = 0;
        if(arrayToTest.length==0){
            return finalInt;
        }

        for (int i = 0; i<arrayToTest.length; i++){
            String integerToAdd;
            integerToAdd = Integer.toString(Math.abs(arrayToTest[i]));
            finalIntegerString += integerToAdd;
        }
        finalInt = Integer.parseInt(finalIntegerString);
        return finalInt;
    }
}
