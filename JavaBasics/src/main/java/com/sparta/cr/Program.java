package com.sparta.cr;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 0 && timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else if(timeOfDay >= 19 && timeOfDay <=23) {
            greeting = "Good evening!";
        }
        else{
            greeting = "invalid time of day";
        }
        return greeting;
    }
}