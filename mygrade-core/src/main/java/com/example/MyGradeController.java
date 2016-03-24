package com.example;

public class MyGradeController {

    private GradeDisplay display;

    public MyGradeController(GradeDisplay display){
        this.display = display;
    }

    public void onSubmit(){
        Integer score = this.display.getScore();
        String grade = this.convertScoreToGrade(score);
        this.display.setGrade(grade);
    }

    private String convertScoreToGrade(Integer score) {
        String grade = "F";
        if(score >= 90){
            grade = "A";
        }
        return grade;
    }
}
