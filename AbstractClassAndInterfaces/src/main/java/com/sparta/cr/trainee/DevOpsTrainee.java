package com.sparta.cr;

public class DevOpsTrainee extends Trainee{

    public DevOpsTrainee(String name, int age, String email, String phone, String[] certifications, String experience, String projects) {
        super(name, age, email, phone, certifications, experience, projects);
    }
    public void train(){
        System.out.println(getName() + " is in training.");
    }
    public void study(){
        System.out.println(getName() + " is studying.");
    }
}
