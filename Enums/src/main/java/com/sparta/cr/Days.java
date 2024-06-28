package com.sparta.cr;

import java.util.Arrays;

public enum Days {

    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday",7);

    private String name;
    private int numberInWeek;

    Days(String name, int numberInWeek) {
        this.name = name;
        this.numberInWeek = numberInWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberInWeek() {
        return numberInWeek;
    }

    public void setNumberInWeek(int numberInWeek) {
        this.numberInWeek = numberInWeek;
    }

    public static void main(String[] args) {
        Days dayOff = Days.FRIDAY;

        System.out.println(dayOff.describeConstable());

        System.out.println(Arrays.toString(Days.values()));
        System.out.println(Days.valueOf("FRIDAY"));


    }
}
