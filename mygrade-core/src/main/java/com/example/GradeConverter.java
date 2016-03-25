package com.example;


public class GradeConverter {

    public String fromScore(Integer score) {
        String grade = "F";
        if(score >= 90){
            grade = "A";
        }
        return grade;
    }
}
