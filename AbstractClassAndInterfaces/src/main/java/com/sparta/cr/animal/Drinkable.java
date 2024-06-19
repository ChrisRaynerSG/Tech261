package com.sparta.cr.animal;

public interface Drinkable extends Sleepable{
    void drink();

    default void print(){
        printFromInterface();
    }

    private static void printFromInterface(){
        System.out.println("I am printing an Interface");
    }

    public static void doSomething(){
        System.out.println("Static method from an Interface");
    }

}
