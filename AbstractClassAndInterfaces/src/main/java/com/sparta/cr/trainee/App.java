package com.sparta.cr.trainee;

public class App {
    public static void main(String[] args) {
        Trainee bob = new JavaTrainee("Bob", 28, "bob@spartaglobal.com", "01234567890", new String[]{"Cert1", "Cert2"},"Lots","Lots","BobsGreatRepo" );
        Trainee dave = new DevOpsTrainee("Dave", 30, "bob@spartaglobal.com", "01234567891", new String[]{"Cert3", "Cert4"},"Lots","Lots");
        Trainee mark = new DevOpsTrainee("Mark", 30, "bob@spartaglobal.com", "01234567891", new String[]{"Cert3", "Cert4"},"Lots","Lots");
        Trainee jeremy = new JavaTrainee("Jeremy", 28, "bob@spartaglobal.com", "01234567890", new String[]{"Cert1", "Cert2"},"None","Lots","BigBeatsGetGithub" );

        Trainee[] trainees = {bob,dave,mark,jeremy};

        for (Trainee trainee: trainees){
            trainee.train();
            trainee.study();
        }
    }
}
