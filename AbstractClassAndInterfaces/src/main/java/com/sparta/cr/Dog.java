package com.sparta.cr;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);

        //Overload
        //name has to be same
        //1. Return type
        //2. Type of Parameters
        //3. Order of Parameters

    }

    @Override
    public void play() {
        super.play();
    }
}
