package com.sparta.cr.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName()+ " does not want to play!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }

    public void climb(){

    }

    @Override
    public void drink() {

    }

    @Override
    public String goToSleep() {
        return getName() + " is sleeping.";
    }
}
