package com.sparta.cr.trainee;

public class JavaTrainee extends Trainee{
    private String github;

    public JavaTrainee(String name, int age, String email, String phone, String[] certifications, String experience, String projects, String github) {
        super(name, age, email, phone, certifications, experience, projects);
        this.github = github;
    }
    public String getGithub() {
        return github;
    }
    public void setGithub(String github) {
        this.github = github;
    }
    public void train(){
        System.out.println(getName() + " is training on updating their github at: " + getGithub());
    }
    public void study(){
        System.out.println(getName() + " is studying how to better improve their github which is: " +getGithub());
    }
}
