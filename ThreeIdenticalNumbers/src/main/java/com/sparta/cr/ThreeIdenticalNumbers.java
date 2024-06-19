package com.sparta.cr;

public class ThreeIdenticalNumbers {
    static boolean doesContainThreeConsecutiveIdenticalNumbers(int[] intArray){
        if(intArray.length <3){
            return false;
        }
        for(int i = 0; i<intArray.length-2; i++){
            if(i == i+1 && i == i+2){
                return true;
            }
        }
        return false;
    }
}
