package com.sparta.cr;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog barry = new Dog(5,"Dachsund","Barry");

    }

}
