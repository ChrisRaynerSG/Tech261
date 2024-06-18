package com.sparta.cr;

public class DevOpsTrainee extends Trainee implements Trainable{
    private String experience;
    private String[] certifications;
    private String[] projects;

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public DevOpsTrainee(String name, int age, String email, String phone) {
        super(name, age, email, phone);
    }

    public void train(){
        //Do something
    }
    public void study(){
        //Do something else
    }
}
