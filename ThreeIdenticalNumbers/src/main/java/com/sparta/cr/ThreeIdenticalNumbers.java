package com.sparta.cr;

public class ThreeIdenticalNumbers {
    static boolean doesContainThreeConsecutiveIdenticalNumbers(int[] intArray){
        if(intArray.length <3){
            return false;
        }
        for(int i = 0; i<intArray.length-2; i++){
            if(intArray[i] == intArray[i+1] && intArray[i] == intArray[i+2]){
                return true;
            }
        }
        return false;
    }
}
