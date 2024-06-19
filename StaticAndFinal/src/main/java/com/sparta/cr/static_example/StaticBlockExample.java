package com.sparta.cr.static_example;

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> names = new ArrayList<>();

    static { //Static block which is run once when the class is loaded
        names.add("Manish");
        names.add("Alex");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }
}
